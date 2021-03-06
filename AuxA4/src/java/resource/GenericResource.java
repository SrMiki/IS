/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Zeida
 */
@Path("horaServidor")
public class GenericResource {
    private static String horaImpuesta="";
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of resource.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        if(horaImpuesta.equals("")){
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat dateFormater= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String hora = dateFormater.format(cal.getTime());
        
        return "(\"Hora\" : \"" + hora + "\"} ";
    }else{
        return horaImpuesta;
        //http://ws.docencia.ces.siani.es/a04/ClienteWebHora/webresources/horaServidor
    }
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
