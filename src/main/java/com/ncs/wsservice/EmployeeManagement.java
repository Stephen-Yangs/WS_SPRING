
package com.ncs.wsservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeManagement", targetNamespace = "http://service.ncs.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeManagement {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service.ncs.com/", className = "com.ncs.wsservice.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.ncs.com/", className = "com.ncs.wsservice.AddResponse")
    public boolean add(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.ncs.wsservice.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "query", targetNamespace = "http://service.ncs.com/", className = "com.ncs.wsservice.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://service.ncs.com/", className = "com.ncs.wsservice.QueryResponse")
    public List<Employee> query();

}
