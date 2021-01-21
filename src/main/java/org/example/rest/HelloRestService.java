package org.example.rest;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/") //this specify a base path

public class HelloRestService {


    MongoClient mongoClient = MongoClients.create();

    // get handle to "Demo" database
    MongoDatabase database = mongoClient.getDatabase("Demo");

    //get handle to the "Samples" collection
    MongoCollection<Document> collection = database.getCollection("Samples");


    @GET //this annotation indicates GET request and the code to execute if we get a GET request

    //the endpoint to utilize
    @Path("/hello")


    public Response hello(){
        //given the path "/hello" reply back with a response with 200 status code OK and "hello"
        StringBuilder sb = new StringBuilder();


        for (Document cur : collection.find()) {
            sb.append(cur.toString());
        }

        mongoClient.close();

        return Response.status(200).entity(sb.toString()).build();

        //return Response.status(200).entity(obj.toString()).build();
    }
}
