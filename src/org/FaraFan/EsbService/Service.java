/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Aug 08, 2005 (11:49:10 PDT) WSDL2Java emitter.
 */

package org.FaraFan.EsbService;

public interface Service extends javax.xml.rpc.Service {
    public String getServiceSoapAddress();

    public ServiceSoap getServiceSoap() throws javax.xml.rpc.ServiceException;

    public ServiceSoap getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public String getServiceSoap12Address();

    public ServiceSoap getServiceSoap12() throws javax.xml.rpc.ServiceException;

    public ServiceSoap getServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
