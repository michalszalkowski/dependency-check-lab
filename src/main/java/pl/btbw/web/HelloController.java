package pl.btbw.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloController {


    @GET
    public String doHello() {
        return "hello";
    }
}