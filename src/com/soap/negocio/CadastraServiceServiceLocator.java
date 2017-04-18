/**
 * CadastraServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.negocio;

public class CadastraServiceServiceLocator extends org.apache.axis.client.Service implements com.soap.negocio.CadastraServiceService {

    public CadastraServiceServiceLocator() {
    }


    public CadastraServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CadastraServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CadastraServicePort
    private java.lang.String CadastraServicePort_address = "http://localhost:8080/CadastraClienteService/CadastraService";

    public java.lang.String getCadastraServicePortAddress() {
        return CadastraServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CadastraServicePortWSDDServiceName = "CadastraServicePort";

    public java.lang.String getCadastraServicePortWSDDServiceName() {
        return CadastraServicePortWSDDServiceName;
    }

    public void setCadastraServicePortWSDDServiceName(java.lang.String name) {
        CadastraServicePortWSDDServiceName = name;
    }

    public com.soap.negocio.CadastraService getCadastraServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CadastraServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCadastraServicePort(endpoint);
    }

    public com.soap.negocio.CadastraService getCadastraServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soap.negocio.CadastraServiceServiceSoapBindingStub _stub = new com.soap.negocio.CadastraServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCadastraServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCadastraServicePortEndpointAddress(java.lang.String address) {
        CadastraServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soap.negocio.CadastraService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soap.negocio.CadastraServiceServiceSoapBindingStub _stub = new com.soap.negocio.CadastraServiceServiceSoapBindingStub(new java.net.URL(CadastraServicePort_address), this);
                _stub.setPortName(getCadastraServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CadastraServicePort".equals(inputPortName)) {
            return getCadastraServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://negocio.soap.com/", "CadastraServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://negocio.soap.com/", "CadastraServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CadastraServicePort".equals(portName)) {
            setCadastraServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
