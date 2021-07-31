
package pack1;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculo", targetNamespace = "http://pack1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculo {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://pack1/", className = "pack1.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://pack1/", className = "pack1.AddResponse")
    @Action(input = "http://pack1/Calculo/addRequest", output = "http://pack1/Calculo/addResponse")
    public int add(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param n
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sum", targetNamespace = "http://pack1/", className = "pack1.Sum")
    @ResponseWrapper(localName = "sumResponse", targetNamespace = "http://pack1/", className = "pack1.SumResponse")
    @Action(input = "http://pack1/Calculo/sumRequest", output = "http://pack1/Calculo/sumResponse")
    public int sum(
        @WebParam(name = "n", targetNamespace = "")
        int n);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://pack1/", className = "pack1.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://pack1/", className = "pack1.HelloResponse")
    @Action(input = "http://pack1/Calculo/helloRequest", output = "http://pack1/Calculo/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divE", targetNamespace = "http://pack1/", className = "pack1.DivE")
    @ResponseWrapper(localName = "divEResponse", targetNamespace = "http://pack1/", className = "pack1.DivEResponse")
    @Action(input = "http://pack1/Calculo/divERequest", output = "http://pack1/Calculo/divEResponse")
    public int divE(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param n
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fact", targetNamespace = "http://pack1/", className = "pack1.Fact")
    @ResponseWrapper(localName = "factResponse", targetNamespace = "http://pack1/", className = "pack1.FactResponse")
    @Action(input = "http://pack1/Calculo/factRequest", output = "http://pack1/Calculo/factResponse")
    public int fact(
        @WebParam(name = "n", targetNamespace = "")
        int n);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "product", targetNamespace = "http://pack1/", className = "pack1.Product")
    @ResponseWrapper(localName = "productResponse", targetNamespace = "http://pack1/", className = "pack1.ProductResponse")
    @Action(input = "http://pack1/Calculo/productRequest", output = "http://pack1/Calculo/productResponse")
    public int product(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divD", targetNamespace = "http://pack1/", className = "pack1.DivD")
    @ResponseWrapper(localName = "divDResponse", targetNamespace = "http://pack1/", className = "pack1.DivDResponse")
    @Action(input = "http://pack1/Calculo/divDRequest", output = "http://pack1/Calculo/divDResponse")
    public double divD(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "minus", targetNamespace = "http://pack1/", className = "pack1.Minus")
    @ResponseWrapper(localName = "minusResponse", targetNamespace = "http://pack1/", className = "pack1.MinusResponse")
    @Action(input = "http://pack1/Calculo/minusRequest", output = "http://pack1/Calculo/minusResponse")
    public int minus(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}
