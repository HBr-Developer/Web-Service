
package soaptp;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentService", targetNamespace = "http://WebService.tp1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentService {


    /**
     * 
     * @return
     *     returns java.util.List<soaptp.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllStudents", targetNamespace = "http://WebService.tp1/", className = "soaptp.GetAllStudents")
    @ResponseWrapper(localName = "getAllStudentsResponse", targetNamespace = "http://WebService.tp1/", className = "soaptp.GetAllStudentsResponse")
    @Action(input = "http://WebService.tp1/StudentService/getAllStudentsRequest", output = "http://WebService.tp1/StudentService/getAllStudentsResponse")
    public List<Student> getAllStudents();

    /**
     * 
     * @param cin
     * @return
     *     returns soaptp.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentByCIN", targetNamespace = "http://WebService.tp1/", className = "soaptp.GetStudentByCIN")
    @ResponseWrapper(localName = "getStudentByCINResponse", targetNamespace = "http://WebService.tp1/", className = "soaptp.GetStudentByCINResponse")
    @Action(input = "http://WebService.tp1/StudentService/getStudentByCINRequest", output = "http://WebService.tp1/StudentService/getStudentByCINResponse")
    public Student getStudentByCIN(
        @WebParam(name = "cin", targetNamespace = "")
        String cin);

    /**
     * 
     * @param limit
     * @return
     *     returns java.util.List<soaptp.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLimitedStudents", targetNamespace = "http://WebService.tp1/", className = "soaptp.GetLimitedStudents")
    @ResponseWrapper(localName = "getLimitedStudentsResponse", targetNamespace = "http://WebService.tp1/", className = "soaptp.GetLimitedStudentsResponse")
    @Action(input = "http://WebService.tp1/StudentService/getLimitedStudentsRequest", output = "http://WebService.tp1/StudentService/getLimitedStudentsResponse")
    public List<Student> getLimitedStudents(
        @WebParam(name = "limit", targetNamespace = "")
        int limit);

}
