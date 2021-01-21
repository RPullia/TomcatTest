package org.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/") //this specify a base path

public class HelloRestService {
    @GET //this annotation indicates GET request and the code to execute if we get a GET request

    //the endpoint to utilize
    @Path("/hello")

    public Response hello(){
        //given the path "/hello" reply back with a respons with 200 status code OK and "hello"
        return Response.status(200).entity("hello").build();
    }
}
