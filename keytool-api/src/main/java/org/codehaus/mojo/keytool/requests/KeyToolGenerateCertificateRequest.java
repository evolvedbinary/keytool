package org.codehaus.mojo.keytool.requests;

/*
 * Copyright 2005-2013 The Codehaus
 *
 * Licensed under the Apache License, Version 2.0 (the "License" );
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Request to do a Generate certificate from a certificate request using the KeyTool tool.
 *
 * <strong>Note:</strong> Such a request requires a jdk &gt;= 1.7.
 *
 * @author <a href="mailto:chemit@codelutin.com">tchemit</a>
 * @since 1.1
 */
public class KeyToolGenerateCertificateRequest
    extends AbstractKeyToolRequestWithKeyStoreAndAliasParameters
{

    /**
     * Key password.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private String keypass;

    /**
     * Output in RFC style.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private boolean rfc;

    /**
     * input file name.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private File infile;

    /**
     * output file name.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private File outfile;

    /**
     * Signature algorithm name.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private String sigalg;

    /**
     * Distinguished name.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private String dname;

    /**
     * Certificate validity start date/time.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private String startdate;

    /**
     * X.509 extension.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private List<String> exts = new ArrayList<String>();

    /**
     * Validity number of days.
     *
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private String validity;

    /**
     * Gets the value of the {@link #rfc} field.
     *
     * @return the value of the {@link #rfc} field
     */
    public boolean isRfc()
    {
        return rfc;
    }

    /**
     * @param rfc value of the field {@link #rfc} to set
     */
    public void setRfc( boolean rfc )
    {
        this.rfc = rfc;
    }

    /**
     * Gets the value of the {@link #infile} field.
     *
     * @return the value of the {@link #infile} field
     */
    public File getInfile()
    {
        return infile;
    }

    /**
     * @param infile value of the field {@link #infile} to set
     */
    public void setInfile( File infile )
    {
        this.infile = infile;
    }

    /**
     * Gets the value of the {@link #outfile} field.
     *
     * @return the value of the {@link #outfile} field
     */
    public File getOutfile()
    {
        return outfile;
    }

    /**
     * @param outfile value of the field {@link #outfile} to set
     */
    public void setOutfile( File outfile )
    {
        this.outfile = outfile;
    }

    /**
     * Gets the value of the {@link #sigalg} field.
     *
     * @return the value of the {@link #sigalg} field
     */
    public String getSigalg()
    {
        return sigalg;
    }

    /**
     * @param sigalg value of the field {@link #sigalg} to set
     */
    public void setSigalg( String sigalg )
    {
        this.sigalg = sigalg;
    }

    /**
     * Gets the value of the {@link #dname} field.
     *
     * @return the value of the {@link #dname} field
     */
    public String getDname()
    {
        return dname;
    }

    /**
     * @param dname value of the field {@link #dname} to set
     */
    public void setDname( String dname )
    {
        this.dname = dname;
    }

    /**
     * Gets the value of the {@link #startdate} field.
     *
     * @return the value of the {@link #startdate} field
     */
    public String getStartdate()
    {
        return startdate;
    }

    /**
     * @param startdate value of the field {@link #startdate} to set
     */
    public void setStartdate( String startdate )
    {
        this.startdate = startdate;
    }

    /**
     * Gets the value of the {@link #exts} field.
     *
     * @return the value of the {@link #exts} field
     * 
     * @deprecated
     */
    public String getExt()
    {
        return exts.isEmpty() ? null : exts.get(0);
    }

    /**
     * @param ext value of the field {@link #exts} to set
     * 
     * @deprecated
     */
    public void setExt( String ext )
    {
        exts.clear();

        if (ext != null)
        {
            exts.add(ext);
        }
    }

    /**
     * @param exts values of the field {@link #exts} to set
     */
    public void setExts( List<String> exts )
    {
        this.exts.clear();

        if (exts != null)
        {
            this.exts.addAll(exts);
        }
    }

    /**
     * Gets the values of the {@link #exts} field.
     *
     * @return the values of the {@link #exts} field
     */
    public List<String> getExts()
    {
        return exts;
    }

    /**
     * Gets the value of the {@link #validity} field.
     *
     * @return the value of the {@link #validity} field
     */
    public String getValidity()
    {
        return validity;
    }

    /**
     * @param validity value of the field {@link #validity} to set
     */
    public void setValidity( String validity )
    {
        this.validity = validity;
    }

    /**
     * Gets the value of the {@code keypass} field.
     *
     * @return the value of the {@code keypass} field.
     */
    public String getKeypass()
    {
        return keypass;
    }

    /**
     * Sets the new given value to the field {@code keypass} of the request.
     *
     * @param keypass the new value of the field {@code keypass}.
     */
    public void setKeypass( String keypass )
    {
        this.keypass = keypass;
    }
}
