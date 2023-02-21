package com.ivandjoh;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1")
public class App {

    @Inject
    GreetingService greetingService;

    @GET
    @Path("")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Welcome to QUARKUS!";
    }

    @GET
    @Path("/greeting/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting(String name) {
        return greetingService.greeting(name);
    }
}