/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Kaino
 */
@WebService(serviceName = "Calculo")
@Stateless()
public class Calculo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param a
     * @param b
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "minus")
    public int minus(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a-b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "product")
    public int product(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a*b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divE")
    public int divE(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        if(b == 0){
            System.out.println("Numero no valido para hacer la division");
            return 0;
        }
        return a/b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divD")
    public double divD(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a/b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sum")
    public int sum(@WebParam(name = "n") int n) {
        int res = 0;
        for(int i = 1; i < n ; i ++){
         res++;
    }
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fact")
     public int fact (@WebParam(name = "n") int n) {
         if(n < 0){
             System.out.println("Numero no valido para hacer el factorial");
             return 0;
        }
        int res = 1;
        for(int i = 1; i < n ; i ++){
         res = res * i;
    }
        return res;
    }
}
