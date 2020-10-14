package com.sebastian_daschner.openshift.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import java.time.Instant;

@Path("hello")
public class HelloResource {

    @GET
    public String hello(@QueryParam("user")String user) {
        if(user == null || user.isEmpty()) {
        return "Hello OpenShift";
        } else {
            return "Hello " + user + "!";
        }

    }

    @GET
    @Path("/test")
    public String helloInd() {
        return "Hello Thomas!!!";
    }

}
