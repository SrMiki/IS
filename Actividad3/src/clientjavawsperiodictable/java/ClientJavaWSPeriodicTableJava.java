/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodictable.java;

import deserializePeriodicTable.NewDataSet1;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author Kaino
 */
public class ClientJavaWSPeriodicTableJava {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws Exception {
        
        System.out.println("¡welcome to the application of the periodic table");
         
        Scanner teclado;
         teclado = new Scanner (System.in);
        int selec = 0;
        while(selec != 5){
            System.out.println("\n Please, chose an option: " + mostrarOpciones());
            selec = seleccionarOpcion(teclado);
            
            switch(selec){
                case 1: 
                    System.out.println("Enter elementName: ");
                    deserializeAtomicNumber( (getAtomicNumber( teclado.next() ) ) );
                    break;
                case 2:
                    System.out.println("Enter elementName: ");
                    System.out.println( getAtomicWeight( teclado.next() ) );
                    break;
                case 3:
                    System.out.println("Showing elemtes of Periodic Table: ");
                    System.out.println( getAtoms());
                    break;
                case 4: 
                    System.out.println("Enter elementName: ");
                    System.out.println( getElementSymbol( teclado.next() ) );
                    break;
                case 5: 
                    break;
            }
        }
        teclado.close();
        System.out.println("Turning off");
                 
    }
     
    private static String mostrarOpciones(){
        return "\n 1) GetAtomicNumber "
                + "\n 2) GetAtomicWeight "
                + "\n 3) GetAtoms "
                + "\n 4) GetElementSymbol "
                + "\n 5) finish.";
    }
     
    private static int seleccionarOpcion(Scanner teclado){
        int res = teclado.nextInt();
        while( res > 5 || res <= 0){
            System.out.print("\n Please, enter a valid number");
            res = teclado.nextInt();
        }
        return res;
    }

    private static void deserializeAtomicNumber ( String s) throws Exception{
        Serializer serializer = new Persister();
        NewDataSet1 NewDataSet = new NewDataSet1();
        serializer.read(NewDataSet, s);
        System.out.println( NewDataSet.getTable().getAtomicNumber() );
    }
    
    
    
    
    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String parseResponse(String response, String endTag) {
        String beginTag = endTag.replace("/", "");
        final int from = response.indexOf(beginTag);
        final int to = response.lastIndexOf(endTag);
        final String beginTagAndContent = response.substring(from, to);
        return beginTagAndContent.substring(beginTagAndContent.indexOf(">") + 1);
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    
    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms(){
        return "";
    }

}
