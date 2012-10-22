// ------------------------------------------------------------------------------
// -- Copyright RainCode
// -- All rights reserved
// --
// -- This file is part of ERTMSFormalSpec software and documentation
// --
// --  ERTMSFormalSpec is free software: you can redistribute it and/or modify
// --  it under the terms of the EUPL General Public License, v.1.1
// --
// -- ERTMSFormalSpec is distributed in the hope that it will be useful,
// -- but WITHOUT ANY WARRANTY; without even the implied warranty of
// -- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// --
// ------------------------------------------------------------------------------
using System;
using System.Collections;
using System.IO;

namespace XmlBooster
{

    public abstract class XmlBBase : IXmlBBase
    {

        IXmlBBase aNext, aFather, aSibling, aFirstSon;

        public void setNext(IXmlBBase n)
        {
            aNext = n;
        }

        public IXmlBBase getNext()
        {
            return aNext;
        }

        public void setSon(IXmlBBase n)
        {
            XmlBBase n1;

            if (n != null)
            {
                n1 = (XmlBBase)n;
                n1.aFather = this;
                n1.aSibling = aFirstSon;
            }
            aFirstSon = n;
        }

        public void setSon(ICollection l)
        {
            if (l != null)
            {
                foreach (IXmlBBase item in l)
                    setSon(item);
            }
        }

        public void setFather(IXmlBBase f)
        {
            aFather = f;
        }

        public IXmlBBase getFather()
        {
            return aFather;
        }

        public abstract void parse(XmlBContext ctxt, String endingTag);
        //  throws XmlBException, XmlBRecoveryException;
        public abstract void parseBody(XmlBContext ctxt);
        //   throws XmlBException, XmlBRecoveryException;

        public abstract void unParse(TextWriter pw, bool typeId,
            String headingTag,
            String endingTag);
        public abstract void unParseBody(TextWriter pw);

        public void unParse(TextWriter pw, bool typeId)
        {
            unParse(pw, this, typeId, null, null);
        }

        public void unParse(TextWriter pw, IXmlBBase el, bool typeId,
            String headingTag,
            String endingTag)
        {
            XmlBBase el2;

            if (el == null)
            {
                return;
            }
            el2 = (XmlBBase)el;

            while (el2 != null)
            {
                el2.unParse(pw, typeId, headingTag, endingTag);
                el2 = (XmlBBase)el2.aNext;
            }
        }

        public void unParse(TextWriter pw, ArrayList l, bool typeId,
            String headingTag,
            String endingTag)
        {
            if (l != null)
                foreach (IXmlBBase item in l)
                    unParse(pw, item, typeId, headingTag, endingTag);
        }

        public String ToXMLString()
        {
            //ByteArrayOutputStream os;
            StringWriter pw;

            // os = new ByteArrayOutputStream();
            // pw = new TextWriter(os);
            pw = new StringWriter();
            unParse(pw, false);
            pw.Flush();
            // return new String(os.toByteArray());
            return pw.ToString();
            //new String(os.toByteArray());
        }

        virtual public void subElements(ArrayList l)
        {
        }

        public IXmlBBase[] subElements()
        {
            ArrayList l = new ArrayList();
            subElements(l);
            for (int i = l.Count - 1; i >= 0; i--)
                if (l[i] == null)
                    l.Remove(i);
            if (l.Count == 0)
                return null;
            IXmlBBase[] res = new IXmlBBase[l.Count];
            l.CopyTo(res, 0);
            return res;
        }

        //		public override String ToString()
        //		{
        //			return ToXMLString();
        //		}

        public void save(String filename, int bufSize)
        {
            FileStream fs;
            StreamWriter pw;

            fs = new FileStream(filename, FileMode.Create);
            pw = new StreamWriter(fs, System.Text.Encoding.ASCII);
            unParse(pw, false);
            pw.Flush();
            fs.Close();
        }

        const int DEFAULT_BUF_SIZE = 16 * 1024;

        public void save(String filename)
        {
            save(filename, DEFAULT_BUF_SIZE);
        }

        public abstract void dispatch(XmlBBaseVisitor v);
        public abstract void dispatch(XmlBBaseVisitor v, bool visitSubNodes);

        bool __dirty = false;

        public void __setDirty(bool val)
        {
            __dirty = val;
        }

        public bool __getDirty()
        {
            return __dirty;
        }

        public virtual void NotifyControllers(Lock aLock)
        {
        }

        /// <summary>
        /// Performs a full text search
        /// </summary>
        /// <param name="search"></param>
        /// <returns>True if the string provided if found in the object</returns>
        public abstract bool find(Object search);
    }

}