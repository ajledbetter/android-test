/*
  Copyright (c) 2005-2012 Wyatt Love

  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:

  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.

  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
 */

package com.kodemore.contact;

public class KmContactEmail
{
    //##################################################
    //# variables
    //################################################## 

    private String             _rawContactId;
    private boolean            _primary;
    private boolean            _superPrimary;
    private String             _address;
    private KmContactEmailType _type;

    /**
     * This holds the label of a custom email type
     */
    private String             _label;

    //##################################################
    //# constructor
    //##################################################

    {
        // none
    }

    //##################################################
    //# accessing
    //##################################################

    public String getRawContactId()
    {
        return _rawContactId;
    }

    public void setRawContactId(String e)
    {
        _rawContactId = e;
    }

    public boolean getPrimary()
    {
        return _primary;
    }

    public void setPrimary(boolean e)
    {
        _primary = e;
    }

    public boolean isPrimary()
    {
        return getPrimary();
    }

    public boolean getSuperPrimary()
    {
        return _superPrimary;
    }

    public void setSuperPrimary(boolean e)
    {
        _superPrimary = e;
    }

    public boolean isSuperPrimary()
    {
        return getSuperPrimary();
    }

    public String getAddress()
    {
        return _address;
    }

    public void setAddress(String e)
    {
        _address = e;
    }

    public KmContactEmailType getType()
    {
        return _type;
    }

    public String getTypeName()
    {
        return hasType()
            ? getType().name()
            : null;
    }

    public void setType(KmContactEmailType e)
    {
        _type = e;
    }

    public boolean hasType()
    {
        return getType() != null;
    }

    public String getLabel()
    {
        return _label;
    }

    public void setLabel(String e)
    {
        _label = e;
    }

    //##################################################
    //# convenience
    //##################################################

    public void setTypeHome()
    {
        setType(KmContactEmailType.HOME);
    }

    public void setTypeMobile()
    {
        setType(KmContactEmailType.MOBILE);
    }

    public void setTypeOther()
    {
        setType(KmContactEmailType.OTHER);
    }

    public void setTypeWork()
    {
        setType(KmContactEmailType.WORK);
    }

    public void setTypeCustom()
    {
        setType(KmContactEmailType.CUSTOM);
    }

    public void setTypeCustom(String label)
    {
        setTypeCustom();
        setLabel(label);
    }

    public void setTypeFromInt(Integer i)
    {
        if ( i == null )
        {
            setType(null);
            return;
        }

        for ( KmContactEmailType e : KmContactEmailType.values() )
            if ( i == e.getCode() )
            {
                setType(e);
                return;
            }

        setType(null);
    }

    /**
     * Convenience method to set this value directly from the android's contacts contract
     * table.
     * 
     * The android table stores this value as an Integer, if set, non-0 means true.   
     */
    public void setPrimaryFromInt(Integer e)
    {
        boolean b = e != null && e != 0;
        setPrimary(b);
    }

    /**
     * Convenience method to set this value directly from the android's contacts contract
     * table.
     * 
     * The android table stores this value as an Integer, if set, non-0 means true.   
     */
    public void setSuperPrimaryFromInt(Integer e)
    {
        boolean b = e != null && e != 0;
        setSuperPrimary(b);
    }
}
