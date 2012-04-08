package org.codehaus.mojo.keytool;

/*
 * Copyright 2005-2012 The Codehaus
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

import org.codehaus.mojo.keytool.requests.KeyToolPrintCRLFileRequest;

import java.io.File;

/**
 * To print the content of a CRL file.
 * <p/>
 * Implemented as a wrapper around the SDK {@code keytool -printcrl} command.
 * <p/>
 * See <a href="http://java.sun.com/j2se/1.5.0/docs/tooldocs/windows/keytool.html">keystore documentation</a>.
 *
 * @author tchemit <chemit@codelutin.com>
 * @goal printCRLFile
 * @requiresProject
 * @since 1.2
 */
public class PrintCRLFileMojo
    extends AbstractKeyToolRequestMojo<KeyToolPrintCRLFileRequest>
{

    /**
     * Input file name.
     * <p/>
     * See <a href="http://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     *
     * @parameter expression="${file}"
     * @since 1.2
     */
    private File file;

    /**
     * Default contructor.
     */
    public PrintCRLFileMojo()
    {
        super( KeyToolPrintCRLFileRequest.class );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected KeyToolPrintCRLFileRequest createKeytoolRequest()
    {
        KeyToolPrintCRLFileRequest request = super.createKeytoolRequest();

        request.setFile( this.file );

        return request;
    }

}