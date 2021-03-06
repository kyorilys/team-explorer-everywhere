// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.authorization._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.authorization._03._AccessControlEntry;
import ms.tfs.services.authorization._03._AuthorizationServiceSoap_ReadAccessControlListsResponse;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AuthorizationServiceSoap_ReadAccessControlListsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _AccessControlEntry[][] readAccessControlListsResult;

    public _AuthorizationServiceSoap_ReadAccessControlListsResponse()
    {
        super();
    }

    public _AuthorizationServiceSoap_ReadAccessControlListsResponse(
        final _AccessControlEntry[][] readAccessControlListsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setReadAccessControlListsResult(readAccessControlListsResult);
    }

    public _AccessControlEntry[][] getReadAccessControlListsResult()
    {
        return this.readAccessControlListsResult;
    }

    public void setReadAccessControlListsResult(_AccessControlEntry[][] value)
    {
        this.readAccessControlListsResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("ReadAccessControlListsResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            /*
                             * The content type of this array is an array, so start another loop.
                             */
                            _AccessControlEntry[] array0 = null;

                            int event1;
                            final List list1 = new ArrayList();

                            do
                            {
                                event1 = reader.nextTag();

                                if (event1 == XMLStreamConstants.START_ELEMENT)
                                {
                                    _AccessControlEntry complexObject1 = new _AccessControlEntry();
                                    complexObject1.readFromElement(reader);
                                    list1.add(complexObject1);
                                }
                            }
                            while (event1 != XMLStreamConstants.END_ELEMENT);

                            array0 = (_AccessControlEntry[]) list1.toArray(new _AccessControlEntry[list1.size()]);

                            list0.add(array0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    /*
                     * The correct size for multi-dimensional arrays is hard to calculate in the generator because
                     * of its recursive nature, so let Java do it for us.
                     */
                    this.readAccessControlListsResult = (_AccessControlEntry[][]) list0.toArray(
                                new _AccessControlEntry[0][0]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
