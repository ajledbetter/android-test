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

package com.kodemore.test.preferences;

import android.content.Context;

import com.kodemore.preference.wrapper.KmAbstractPreferenceWrapper;

/**
 * I provide a sample of how an application might 
 * access complex preferences that are backed by a 
 * PreferenceManager.
 */
public class TySimplePreferenceWrapper
    extends KmAbstractPreferenceWrapper
{
    //##################################################
    //# constants
    //##################################################

    private static final String PREFERENCES_NAME = "simplePreferences";

    private static final String KEY_ENABLED      = "enabled";
    private static final String KEY_COLOR        = "color";
    private static final String KEY_EMAIL        = "email";
    private static final String KEY_SIZE         = "size";

    //##################################################
    //# constructor
    //##################################################

    public TySimplePreferenceWrapper(Context context)
    {
        super(PREFERENCES_NAME);
    }

    //##################################################
    //# accessing
    //##################################################

    public Boolean getEnabled()
    {
        return getBoolean(KEY_ENABLED);
    }

    public void setEnabled(Boolean e)
    {
        setBoolean(KEY_ENABLED, e);
    }

    public String getColor()
    {
        return getString(KEY_COLOR);
    }

    public void setColor(String e)
    {
        setString(KEY_COLOR, e);
    }

    public String getEmail()
    {
        return getString(KEY_EMAIL);
    }

    public void setEmail(String e)
    {
        setString(KEY_EMAIL, e);
    }

    public Integer getSize()
    {
        return getInteger(KEY_SIZE);
    }

    public void setSize(Integer e)
    {
        setInteger(KEY_SIZE, e);
    }
}
