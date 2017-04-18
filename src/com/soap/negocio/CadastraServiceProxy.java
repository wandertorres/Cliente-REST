package com.soap.negocio;

public class CadastraServiceProxy implements com.soap.negocio.CadastraService {
  private String _endpoint = null;
  private com.soap.negocio.CadastraService cadastraService = null;
  
  public CadastraServiceProxy() {
    _initCadastraServiceProxy();
  }
  
  public CadastraServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCadastraServiceProxy();
  }
  
  private void _initCadastraServiceProxy() {
    try {
      cadastraService = (new com.soap.negocio.CadastraServiceServiceLocator()).getCadastraServicePort();
      if (cadastraService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cadastraService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cadastraService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cadastraService != null)
      ((javax.xml.rpc.Stub)cadastraService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soap.negocio.CadastraService getCadastraService() {
    if (cadastraService == null)
      _initCadastraServiceProxy();
    return cadastraService;
  }
  
  public com.soap.negocio.Cliente cadastrar(java.lang.String arg0, int arg1) throws java.rmi.RemoteException{
    if (cadastraService == null)
      _initCadastraServiceProxy();
    return cadastraService.cadastrar(arg0, arg1);
  }
  
  
}