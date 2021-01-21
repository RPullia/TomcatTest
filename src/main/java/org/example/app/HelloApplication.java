package org.example.app;

//import the rest service created
import org.example.rest.HelloRestService;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloApplication extends Application{

    private Set<Object> singletons = new HashSet<Object>();

    public HelloApplication(){

        //register our hello service adding it to our set of singletons
        singletons.add(new HelloRestService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
