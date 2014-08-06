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

package com.kodemore.view.value;

import android.os.Bundle;

import com.kodemore.utility.Kmu;
import com.kodemore.view.KmUiManager;

public class KmStringValue
    extends KmValue<String>
{
    //##################################################
    //# constructor
    //##################################################

    public KmStringValue(KmUiManager ui)
    {
        super(ui);
    }

    //##################################################
    //# testing
    //##################################################

    @Override
    public boolean hasValue()
    {
        return Kmu.hasValue(getValue());
    }

    //##################################################
    //# state
    //##################################################

    @Override
    protected void saveState(Bundle state, String key, String value)
    {
        if ( value == null )
            state.remove(key);
        else
            state.putString(key, value);
    }

    @Override
    protected String restoreState(Bundle state, String key)
    {
        return state.containsKey(key)
            ? state.getString(key)
            : null;
    }

}
