package org.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/") //this specify a base path

public class HelloRestService {

    String json = "{\n" +
            "\t\"email\": \"email@example.com\",\n" +
            "\t\"timestamp\": {\n" +
            "\t\t\"$date\": \"2021-01-20T16:59:20.801Z\"\n" +
            "\t},\n" +
            "\t\"version\": \"2.0\",\n" +
            "\t\"path\": \"my.package.className\"\n} ";

    @GET //this annotation indicates GET request and the code to execute if we get a GET request

    //the endpoint to utilize
    @Path("/hello")

    public Response hello(){
        //given the path "/hello" reply back with a respons with 200 status code OK and "hello"
        return Response.status(200).entity(json).build();
    }
}
