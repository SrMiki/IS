/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewsfootball;

import eu.dataaccess.footballpool.ArrayOfString;
import eu.dataaccess.footballpool.ArrayOftCountryInfo;
import eu.dataaccess.footballpool.TCountryInfo;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kaino
 */
public class ClienteWSFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Los método están en el web service >> info >> infoSoap12
        /**
         * Ejercicio 1. Imprimir por pantalla todas las tarjetas amarillas
         * que hay en total
         */
        //Imprimimos directamente
        System.out.println("Yellow cards" + yellowCardsTotal());
       
        /**
         * Ejercicio 2. Imprirmir por pantalla todos los defenzas que tiene
         * un pais.
         */
        Scanner teclado = new Scanner (System.in);
        String pais = teclado.next();//recogemos el nombre del pais. 
        //Evitar escribirlo mal 
        System.out.println("Denfesas de " + pais +":" +  (allDefenders(pais).getString()) );
        
 
        
        /**
         * Ejercicio 3. Imprimir por pantalla los nombres de todos los defenzas
         * de CADA pais 
         */
        //Creamos una lista donde guardar el ArrayInfoCountry
        List<TCountryInfo> tcountryinfo = (countryNames(true).getTCountryInfo());
        //La recorremos y obtenemos el nombre, lo imprimimos y lo pasamos como 
        //parametro al método de allDefenfeders
        for(TCountryInfo tcountryinfo1: tcountryinfo) {
            String country = tcountryinfo1.getSName();//Obtenemos el nombre de los paises
            System.out.println(country + ": " +(allDefenders(country).getString()));
        }  
        
    }

    
    private static int yellowCardsTotal() {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap12();
        return port.yellowCardsTotal();
    }

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap12();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap12();
        return port.countryNames(bWithCompetitors);
    }
    
}
