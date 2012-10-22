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
using System.Text;

namespace XmlBooster
{
    public abstract class XmlBContext
    {
        private const int CR = 13;

        public const int WS_PRESERVE = XmlBBaseAcceptor.WS_PRESERVE;
        public const int WS_REPLACE = XmlBBaseAcceptor.WS_REPLACE;
        public const int WS_COLLAPSE = XmlBBaseAcceptor.WS_COLLAPSE;


        private ArrayList errList;

        public virtual void reset()
        {
            errList = null;
        }

        public int errCount()
        {
            if (errList == null)
            {
                return 0;
            }
            return errList.Count;
        }

        public void restoreErrCount(int val)
        {
            while (errCount() > val)
                errList.Remove(errList.Count - 1);
        }

        private void appendError(XmlBError err)
        {
            if (errList == null)
            {
                errList = new ArrayList();
            }
            errList.Add(err);
        }

        private static XmlBConverter theConv;

        public static void setConverter(XmlBConverter conv)
        {
            theConv = conv;
        }

        public static XmlBConverter getConverter()
        {
            return theConv;
        }


        private int recoveryBp;
        private String[] stack;

        public int saveRecovery(String endTag)
        {
            if (stack == null)
            {
                stack = new String[128];
            }
            stack[recoveryBp] = endTag;
            recoveryBp++;
            return recoveryBp - 1;
        }

        public void restoreRecovery(int savedValue)
        {
            recoveryBp = savedValue;
        }

        public abstract bool readFile(String fname);
        public abstract void close();
        public abstract char charAt(int pos);
        public abstract bool posOk(int pos);
        public abstract char current();
        public abstract void advanceUnSafe();
        public abstract void moveBack(int step);
        public abstract void skipTill(char ch);
        public abstract String slice(int pos, int len);

        public String slice(int pos)
        {
            String a = slice(pos, getPtr() - pos);
            //if (a == null)
            //  System.out.println ("Slice returns null !");
            // else
            //  System.out.println ("Slice: " + a);
            return a;
        }

        public void advance()
        //  throws XmlBException
        {
            advanceUnSafe();
            checkEof();
        }

        /// <summary>Is invoked in case of a failure for which
        /// there is still hope to use error recovery.</summary>
        public void recoverableFail(String msg)
        //  throws XmlBException, XmlBRecoveryException
        {
            bool goOn;
            int first;
            String a;
            XmlBError err;

            // System.out.println ("RecoveryBp: " + recoveryBp);
            if (recoveryBp == 0)
            {
                fatalFail(msg);
            }
            err = new XmlBError(msg, getPtr());
            goOn = true;
            while (goOn)
            {
                skipTill('<');
                first = getPtr();
                advance();
                // System.out.println ("Current = " + current());
                if (current() == '/')
                {
                    advance();
                    skipTill('>');
                    a = slice(first, 1 + getPtr() - first);
                    try
                    {
                        advance();
                    }
                    catch (XmlBException)
                    {
                        ;
                    }

                    // System.out.println ("Found: " + a);
                    for (int i = recoveryBp - 1; i >= 0; i--)
                    {
                        //System.out.println ("Trying: " +i + ":" +
                        //                    a + "/" + stack[i]);
                        if (a.Equals(stack[i]))
                        {
                            appendError(err);
                            throw new XmlBRecoveryException(stack[i]);
                        }
                    }
                }
            }
            fatalFail(msg);
        }

        /// <summary>Aborts the entire processing, including
        /// all nested - recursive - elements. This functions
        /// throws an exception which is only caught
        /// at the outermost nesting level.</summary>
        public void fatalFail(String msg)
        //  throws XmlBException
        {
            appendError(new XmlBError(msg, getPtr()));
            throw new XmlBException(msg);
        }

        public void localFail(String msg)
        {
            appendError(new XmlBError(msg, getPtr()));
        }

        public void fail(String msg)
        // throws XmlBException
        {
            fatalFail(msg);
        }

        public String errorMessage(XmlBError err)
        {
            int f;
            int t;
            StringBuilder res;
            String errMsg;
            int errPtr;

            int line = 1;
            int col = 1;

            errMsg = err.getMsg();
            errPtr = err.getPtr();

            ArrayList tmp = errList;
            reset();
            errList = tmp;
            // Find the line & column numbers
            // This is a bit brutal though....
            for (int i = 0; i < errPtr; i++)
            {
                if (current() == '\n')
                {
                    line += 1;
                    col = 1;
                }
                else
                {
                    col += 1;
                }
                advance();
            }

            res = new StringBuilder();
            res.Append(line); res.Append(":"); res.Append(col); res.Append(":");
            res.Append(errMsg);
            res.Append(":\n");
            f = errPtr - 60;
            t = errPtr + 60;
            if (f < 0)
                f = 0;
            else
                res.Append(" ... ");
            for (int i = f; i < t; i++)
            {
                if (i == errPtr)
                    res.Append('^');
                if (posOk(i))
                    res.Append(charAt(i));
            }
            if (!posOk(t))
            {
                res.Append("[EOF]");
            }
            res.Append("\n");
            return res.ToString();
        }

        public String errorMessage()
        {
            String res;
            bool first = true;

            res = "";
            if (errList != null)
            {
                foreach (XmlBError err in errList)
                {
                    if (first)
                        res = res + "\n";
                    first = false;
                    res = res + errorMessage(err);
                }
            }
            return res;
        }

        public void dumpError()
        {
            System.Console.Error.WriteLine(errorMessage());
        }

        public bool lookAhead1(char ch)
        {
            try
            {
                if (current() == ch)
                {
                    advance();
                    return true;
                }
            }
            catch (Exception)
            {
            }
            return false;
        }

        public abstract bool lookAhead2(char ch1, char ch2);
        public abstract bool lookAhead3(char ch1, char ch2, char ch3);
        public abstract bool lookAheadString(String str);

        public bool acceptNl()
        {
            if (current() == '\n')
            {
                advanceUnSafe();
                return true;
            }
            else if ((int)current() == CR)
            {
                advanceUnSafe();
                if (current() == '\n')
                    advanceUnSafe();
                return true;
            }
            return false;
        }

        /// <summary>This method checks whether the input contains
        /// a given string and whether the character following
        /// it could not be part of a tag. Essentially, this
        /// is to avoid accepting &lt;ABCDE when expecting &lt;ABC</summary>
        public bool lookAheadOpeningTag(String str)
        {
            int ptr;
            char ch;

            ptr = getPtr();
            if (lookAheadString(str))
            {
                ch = current();
                if ((ch <= ' ') ||
                    (ch == '/') ||
                    (ch == '>'))
                    return true;
                else
                    setPtr(ptr);
            }
            return false;
        }

        public void accept2(char ch1, char ch2)
        //  throws XmlBException, XmlBRecoveryException
        {
            if (!lookAhead2(ch1, ch2))
                recoverableFail("String expected: " + ch1 + ch2);
        }

        public void accept3(char ch1, char ch2, char ch3)
        //  throws XmlBException, XmlBRecoveryException
        {
            if (!lookAhead3(ch1, ch2, ch3))
                recoverableFail("String expected: " + ch1 + ch2 + ch3);
        }

        public void accept(char ch)
        //  throws XmlBException, XmlBRecoveryException
        {
            if (current() == ch)
                advance();
            else
            {
                // System.out.println ("char    : " + currentCh);
                // System.out.println ("expected: " + ch);
                // System.out.println ("ptr     : " + ptr);
                recoverableFail("Character expected: " + ch);
            }
        }
        //----------------------------------------------
        public void acceptString(String str)
        // throws XmlBException, XmlBRecoveryException
        {
            if (!lookAheadString(str))
                recoverableFail("String expected: " + str);
        }

        //----------------------------------------------
        public int hexDigit(char c)
        {
            if (c >= '0' && c <= '9')
                return c - '0';
            if (c >= 'A' && c <= 'F')
                return c - 'A' + 10;
            if (c >= 'a' && c <= 'f')
                return c - 'a' + 10;
            return -1;
        }

        //----------------------------------------------
        public int acceptHexa()
        {
            char ch;
            int res;
            int i;

            ch = current();
            res = hexDigit(ch);
            if (res < 0)
                return -1;
            advance();
            ch = current();
            i = hexDigit(ch);
            if (i >= 0)
            {
                res = (16 * res) + i;
                advance();
            }
            return res;
        }

        //----------------------------------------------
        public int fetchInteger()
        //  throws XmlBException, XmlBRecoveryException
        {
            bool negate = false;
            int res = 0;
            char c;

            if (current() == '-')
            {
                negate = true;
                advance();
            }
            else if (current() == '+')
            {
                advance();
            }
            c = current();
            while ((c >= '0') && (c <= '9'))
            {
                res = res * 10 + (c - '0');
                advanceUnSafe();
                c = current();
            }
            if (negate)
                return -res;
            else
                return res;
        }
        //----------------------------------------------
        public int checkIntegerMin(int min, int val)
        {
            if (val < min)
                fail("Inclusive lower bound failure");

            return val;
        }
        //----------------------------------------------
        public int checkIntegerMax(int max, int val)
        {
            if (val > max)
                fail("Inclusive upper bound failure");

            return val;
        }
        //----------------------------------------------
        public long fetchLong()
        {
            bool negate = false;
            long res = 0;
            char c;

            if (current() == '-')
            {
                negate = true;
                advance();
            }
            else if (current() == '+')
            {
                advance();
            }
            c = current();
            while ((c >= '0') && (c <= '9'))
            {
                res = res * 10 + (c - '0');
                advanceUnSafe();
                c = current();
            }
            if (negate)
                return -res;
            else
                return res;
        }
        //----------------------------------------------
        public long checkLongMin(long min, long val)
        {
            if (val < min)
                fail("Inclusive lower bound failure");

            return val;
        }
        //----------------------------------------------
        public long checkLongMax(long max, long val)
        {
            if (val > max)
                fail("Inclusive upper bound failure");

            return val;
        }
        //----------------------------------------------
        public double fetchDouble()
        //throws XmlBException, XmlBRecoveryException
        {
            StringBuilder buff;
            char ch;
            String a;

            buff = new StringBuilder();
            ch = current();
            if (ch == '+')
            {
                advance();
                ch = current();
            }
            while ((ch >= '0' && ch <= '9') ||
                           (ch == '-') || (ch == '.') || (ch == ',') ||
                           (ch == '+') || (ch == 'E') || (ch == 'e'))
            {
                buff.Append(ch);
                advance();
                ch = current();
            }
            a = buff.ToString();
            try
            {
                if (theConv != null)
                    return theConv.stringToDouble(a);
                else
                    return Double.Parse(a);
            }
            catch (Exception)
            {
                recoverableFail("Not a valid float:" + a);
                return 0.0;
            }
        }
        //----------------------------------------------
        public double checkIntegerMin(double min, double val)
        {
            if (val < min)
                fail("Inclusive lower bound failure");

            return val;
        }
        //----------------------------------------------
        public double checkIntegerMax(double max, double val)
        {
            if (val > max)
                fail("Inclusive upper bound failure");

            return val;
        }


        public abstract void setPtr(int nptr);
        public abstract int getPtr();

        public bool eofReached()
        {
            return posOk(getPtr());
        }

        public bool isAlNum()
        {
            char ch;
            bool res;

            ch = current();
            res = ((ch >= 'a') && (ch <= 'z')) ||
                   ((ch >= 'A') && (ch <= 'Z')) ||
                   ((ch >= '0') && (ch <= '9'));
            // if (! res)
            //   System.out.println ("Is not alnum:" + ch);
            return res;
        }

        public char acceptQuote()
        //throws XmlBException, XmlBRecoveryException
        {
            char c;

            c = current();

            if (c == '"' || c == '\'')
            {
                advance();
                return c;
            }
            recoverableFail("Quote expected");
            return ' ';
        }

        StringBuilder theBuffer;

        public StringBuilder getStringBuilder()
        {
            if (theBuffer == null)
                theBuffer = new StringBuilder();
            return theBuffer;
        }

        public String acceptStringAttribute(int maxLen, char quote)
        //  throws XmlBException, XmlBRecoveryException
        {
            //
            //res = acceptUntil (quote);
            //if ((maxLen > 0) &&  (res.length() > maxLen))
            //  fail ("Maximum length exceeded");
            //return res;

            StringBuilder buff;
            char c;
            buff = getStringBuilder();
            buff.Length = 0;
            if (maxLen > 0)
                maxLen++;
            while ((c = current()) != quote)
            {
                buff.Append(current());
                advanceUnSafe();
                maxLen--;
                if (maxLen == 0)
                    recoverableFail("Maximum length exceeded");
            }

            return buff.ToString();
        }
        //-----------------------------------------------------------
        public String acceptUntil(String search, bool ret)
        // throws XmlBException
        {

            int start, stop;
            char first;

            first = search[0];
            if (search.Length == 1)
                if (ret)
                    return acceptUntil(first);
                else
                {
                    skipTill(first);
                    return null;
                }
            start = getPtr();

            while (true)
            {
                skipTill(first);
                stop = getPtr();
                if (lookAheadString(search))
                {
                    if (ret)
                        return slice(start, stop - start);
                    else
                        return null;
                }
                else
                    advanceUnSafe();
            }
        }
        //---------------------------------------------
        public String acceptUntil(char ch)
        //  throws XmlBException
        {
            // StringBuilder buff;
            // char c;
            // buff = getStringBuilder();
            // buff.setLength(0);
            // while ((c = current()) != ch)
            // {
            //     buff.append(current());
            //     advanceUnSafe();
            // }
            // return buff.toString();

            int start;
            int stop;

            start = getPtr();
            skipTill(ch);
            stop = getPtr();
            return slice(start, stop - start);
        }
        //---------------------------------------------
        virtual public void checkEof()
        //  throws XmlBException
        {
            if (!posOk(getPtr()))
                fatalFail("Unexpected end of file");
        }
        //---------------------------------------------
        private void skipTillBalanced()
        {
            int level = 1;
            char ch;

            while (level > 0)
            {
                advance();
                checkEof();
                ch = current();
                if (ch == '<')
                    level++;
                else if (ch == '>')
                    level--;
            }
        }
        //---------------------------------------------
        public void skipWhiteSpace()
        //   throws XmlBException
        {
            bool goon;

            goon = true;

            while (goon)
            {
                goon = false;
                while (current() <= ' ')
                    advance();
                if (lookAheadString("<!--"))
                {
                    goon = true;
                    while (goon)
                    {
                        skipTill('-');
                        if (lookAhead3('-', '-', '>'))
                            goon = false;
                        else
                            advanceUnSafe();
                    }
                    checkEof();
                    goon = true;
                }
                if (!goon && current() == '<')
                {
                    char ch = charAt(getPtr() + 1);
                    if (ch == '?')
                    {
                        goon = true;
                        skipTill('>');
                        advance();
                    }
                    else if ((ch == '!') &&
                              charAt(getPtr() + 2) != '[')
                    {
                        goon = true;
                        skipTillBalanced();
                        advance();
                    }
                }
            }
        }

        //// <remarks>Swift stuff</remarks>
        private static XmlBCharClass charClassN;
        private static XmlBCharClass charClassA;
        private static XmlBCharClass charClassE;
        private static XmlBCharClass charClassC;
        private static XmlBCharClass charClassH;
        private static XmlBCharClass charClassX;
        private static XmlBCharClass charClassY;
        private static XmlBCharClass charClassZ;

        private static XmlBCharClassD charClassD;

        private static void checkCharClasses()
        {
            if (charClassN != null)
                return;

            charClassN = new XmlBCharClass();
            charClassN.init("0123456789");

            charClassA = new XmlBCharClass();
            charClassA.init("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

            charClassE = new XmlBCharClass();
            charClassE.init(" ");

            charClassC = new XmlBCharClass();
            charClassC.init("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");

            charClassH = new XmlBCharClass();
            charClassH.init("0123456789ABCDEF");

            charClassX = new XmlBCharClass();
            charClassX.init("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz/-?:().,+{}\' ");

            charClassY = new XmlBCharClass();
            charClassY.init("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ.,-()/=+:?!%&*<>\'\" ");

            charClassZ = new XmlBCharClass();
            charClassZ.init("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.,-()/=+:?!%&*<>;{@#\'\" ");

            charClassD = new XmlBCharClassD();
            charClassD.init("0123456789,");
        }

        private static XmlBCharClass getCharClass(char ch)
        {
            checkCharClasses();
            switch (ch)
            {
                case 'n': return charClassN;
                case 'a': return charClassA;
                case 'e': return charClassE;
                case 'c': return charClassC;
                case 'h': return charClassH;
                case 'x': return charClassX;
                case 'y': return charClassY;
                case 'z': return charClassZ;
                case 'd': return charClassD;
                default:
                    System.Console.Error.WriteLine("Char class: " + ch);
                    break;
            }
            return null;
        }

        private bool acceptCharClass(char charClass)
        {
            if (getCharClass(charClass).accept(current()))
            {
                try
                {
                    advance();
                    return true;
                }
                catch (XmlBException)
                {
                    return false;
                }
            }
            else
            {
                // System.out.println ("failed in legB:" + charClass + "/" + (int)current());
                return false;
            }
        }

        private bool validateCharClass(char charClass, String theString)
        {
            return getCharClass(charClass).validate(theString);
        }

        private int doAcceptExpression(int len, char charClass)
        {
            int i = 0;
            while ((i < len) &&
                   (acceptCharClass(charClass)))
                i++;
            return i;
        }

        public bool acceptExpression(int len, char charClass)
        {
            int saved = getPtr();
            int i = doAcceptExpression(len, charClass);
            if ((i > 0) && (i <= len))
                return true;
            setPtr(saved);
            return false;
        }

        public bool acceptFixedLengthExpression(int len, char charClass)
        {
            int saved = getPtr();
            int i = doAcceptExpression(len, charClass);
            if (i != len)
            {
                setPtr(saved);
                return false;
            }
            else
            {
                return true;
            }
        }

        public bool acceptMinMaxLengthExpression(int min, int max, char charClass)
        {
            int saved = getPtr();
            int i = doAcceptExpression(max, charClass);
            if ((i >= min) && (i < max))
                return true;
            setPtr(saved);
            return false;
        }
        //---------------------------------------------------------------------------
        public bool acceptRowColLengthExpression(int row, int col, char charClass)
        {
            acceptNl();
            int saved;
            int r;

            saved = getPtr();
            try
            {
                r = 1;
                while (r <= row && current() != ':')
                {
                    if (!acceptExpression(col, charClass))
                    {
                        setPtr(saved);
                        // System.out.println ("Err in leg 0");
                        return false;
                    }
                    if (!acceptNl())
                    {
                        setPtr(saved);
                        // System.out.println ("Err in leg 1");
                        return false;
                    }
                    r++;
                }
                moveBack(1);
                if (current() != '\n')
                    advance();
                return true;
            }
            catch (XmlBException)
            {
                setPtr(saved);
                return false;
            }
        }
        //-----------------------------------
        public bool weakEofReached()
        {
            int i = getPtr();
            bool res = true;

            while (posOk(i))
            {
                char ch = charAt(i);
                if (ch > ' ')
                {
                    //System.out.println ("remaining char:" + i + "/" + ch + "/" + (int) ch);
                    res = false;
                    return res;
                }
                i++;
            }
            return res;
        }

        // -------------------------------------
        public String cleanUpLineFeeds(String a)
        {

            return a.Trim();

            //    int start, end;
            //    String b;
            //
            //    start = 0;
            //    while (a.charAt(start) < ' ' && start < a.length())
            //      start ++;
            //    if (start >= a.length())
            //      return null;
            //    end = a.length() - 1;
            //    while (a.charAt(end) < ' ')
            //      end --;
            //    if (start == 0 && end == a.length() - 1)
            //      return a;
            //    b = a.substring (start, end);
            //    System.out.println ("Converted " + a + " into " + b);
            //    return b;
        }
        //-------------------------------------------------
        static bool relaxedRegExp = false;

        public bool getRelaxedRegExp()
        {
            return relaxedRegExp;
        }

        public void setRelaxedRegExp(bool fl)
        {
            relaxedRegExp = fl;
        }

        /// <summary>Replaces all occurrences of CR and TABS by white spaces</summary>
        /// <param name="a"> the character string on which the replacement must be performed</param>
        /// <returns><code>a</code> where occurrences of CR and TABS are replaced by white space.</returns>
        public String replace(String a)
        {
            if (a == null)
                return null;
            return a.Replace('\n', ' ').Replace('\t', ' ').Replace('\r', ' ');
        }

        /// <summary>Replaces all sequence of one or more occurrences of CR,
        /// TABS or white space by a single white space.</summary>
        /// <param name="a">the character string on which the replacement must be performed</param>
        /// <returns><code>a</code> where occurrences of CR, white space and TABS are replaced by a single white space.</returns>
        public String collapse(String a)
        {
            if (a == null)
                return null;
            String b = replace(a).Trim();
            if (b == null && b.Length == 0)
                return null;
            StringBuilder sb = new StringBuilder();
            char last = ';';
            for (int i = 0; i < b.Length; i++)
            {
                char ch = b[i];
                if (last != ' ' || ch != ' ')
                    sb.Append(ch);
                last = ch;
            }
            return sb.ToString();
        }

    }

}
