/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientecalculator;

import java.util.Scanner;

/**
 *
 * @author Kaino
 */
public class ClienteCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Introduzca dos enteros: ");
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        System.out.println("Calculadora: \nelegia una operacion: "
                + "\n 1) sumar \n 2) restar \n 3) multiplicar \n 4) dividir "
                + "\n 5) sumatorio \n 6) factorial ");
        
        int select = teclado.nextInt();
        
        switch ( select )  {
            
            case 1:
                System.out.println("la suma da: " + add(a,b));
                break;
            case 2:
                System.out.println("la resta da: " + minus(a,b));
                break;
            case 3:
                System.out.println("el producto da: " + product(a,b));
                break;
            case 4:
                System.out.println("la division da: " + divE(a,b));
                break;
            case 5:
                System.out.println("el sumattorio de "+ a+ " da: " + sum(a) 
                        + "\n y el de "+ b + " :" + sum(b));
                break;
            case 6: 
                System.out.println("el factorial de "+ a + "da: " + fact(a) 
                        + "\n y el de " + b +" : " + fact(b));
                break;
            default:
                System.err.println("ERROR. Valor no valido");
                break;
        }
        
        
    }

    private static int add(int a, int b) {
        pack1.Calculo_Service service = new pack1.Calculo_Service();
        pack1.Calculo port = service.getCalculoPort();
        return port.add(a, b);
    }

    private static int divE(int a, int b) {
        pack1.Calculo_Service service = new pack1.Calculo_Service();
        pack1.Calculo port = service.getCalculoPort();
        return port.divE(a, b);
    }

    private static int fact(int n) {
        pack1.Calculo_Service service = new pack1.Calculo_Service();
        pack1.Calculo port = service.getCalculoPort();
        return port.fact(n);
    }

    private static int minus(int a, int b) {
        pack1.Calculo_Service service = new pack1.Calculo_Service();
        pack1.Calculo port = service.getCalculoPort();
        return port.minus(a, b);
    }

    private static int product(int a, int b) {
        pack1.Calculo_Service service = new pack1.Calculo_Service();
        pack1.Calculo port = service.getCalculoPort();
        return port.product(a, b);
    }

    private static int sum(int n) {
        pack1.Calculo_Service service = new pack1.Calculo_Service();
        pack1.Calculo port = service.getCalculoPort();
        return port.sum(n);
    }

    private static double divD(int a, int b) {
        pack1.Calculo_Service service = new pack1.Calculo_Service();
        pack1.Calculo port = service.getCalculoPort();
        return port.divD(a, b);
    }
    
}
