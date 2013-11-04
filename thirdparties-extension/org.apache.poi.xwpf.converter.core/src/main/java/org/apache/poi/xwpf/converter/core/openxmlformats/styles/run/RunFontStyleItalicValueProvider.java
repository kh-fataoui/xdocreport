/**
 * Copyright (C) 2011-2012 The XDocReport Team <xdocreport@googlegroups.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.apache.poi.xwpf.converter.core.openxmlformats.styles.run;

import org.apache.poi.xwpf.converter.core.styles.XWPFStylesDocument;
import org.apache.poi.xwpf.converter.core.utils.XWPFUtils;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;

public class RunFontStyleItalicValueProvider
    extends AbstractRunValueProvider<Boolean>
{

    public static RunFontStyleItalicValueProvider INSTANCE = new RunFontStyleItalicValueProvider();

    @Override
    public Boolean getValue( CTRPr rpr, XWPFStylesDocument stylesDocument )
    {
        return isItalic( rpr );
    }

    @Override
    public Boolean getValue( CTParaRPr rpr, XWPFStylesDocument stylesDocument )
    {
        return isItalic( rpr );
    }

    private static Boolean isItalic( CTRPr pr )
    {
        if ( pr == null || !pr.isSetI() )
        {
            return null;
        }
        return XWPFUtils.isCTOnOff( pr.getI() );
    }

    private static Boolean isItalic( CTParaRPr pr )
    {
        if ( pr == null || !pr.isSetI() )
        {
            return null;
        }
        return XWPFUtils.isCTOnOff( pr.getI() );
    }

}
