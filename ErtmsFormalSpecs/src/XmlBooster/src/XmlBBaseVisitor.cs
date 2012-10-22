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
namespace XmlBooster
{
    public abstract class XmlBBaseVisitor
    {

        public virtual void visit(IXmlBBase obj)
        {
        }

        public virtual void visit(IXmlBBase obj, bool visitSubNodes)
        {
        }

        abstract public void dispatch(IXmlBBase obj);
        abstract public void dispatch(IXmlBBase obj, bool visitSubNodes);

    }
}