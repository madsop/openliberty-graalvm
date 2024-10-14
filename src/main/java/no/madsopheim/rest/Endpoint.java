package no.madsopheim.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@ApplicationScoped
public class Endpoint {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/")
    public String get() {
        return "Hi there! The time is " + System.currentTimeMillis();
    }
}
