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

package com.kodemore.test;

import java.util.Properties;

import android.view.View;

import com.kodemore.collection.KmList;
import com.kodemore.view.KmActivity;
import com.kodemore.view.KmTwoLineListView;

/**
 * I list the system properties.
 */
public class TySystemPropertiesActivity
    extends KmActivity
{
    //##################################################
    //# variables
    //##################################################

    private KmTwoLineListView _listView;

    //##################################################
    //# init
    //##################################################

    @Override
    protected void init()
    {
        _listView = new KmTwoLineListView(ui());

        Properties p = System.getProperties();

        KmList<String> keys = new KmList<String>();
        for ( Object e : p.keySet() )
            keys.add((String)e);
        keys.sort();

        for ( String key : keys )
            _listView.addItem(key, p.get(key));
    }

    //##################################################
    //# layout
    //##################################################

    @Override
    protected View createLayout()
    {
        return _listView;
    }

}
