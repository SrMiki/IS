
package decBin;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    public GenericResource() {
    }
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public String putXml(String content) {
        int n=Integer.parseInt(content);
        return Integer.toBinaryString(n);
    }
}
