
package com.soapservice.importWSDL.service;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "SQLException", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class SQLException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SQLException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SQLException_Exception(String message, SQLException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SQLException_Exception(String message, SQLException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.soapservice.importWSDL.service.SQLException
     */
    public SQLException getFaultInfo() {
        return faultInfo;
    }

}
