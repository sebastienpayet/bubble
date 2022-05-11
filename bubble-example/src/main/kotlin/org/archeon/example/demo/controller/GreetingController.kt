package org.archeon.example.demo.controller

import org.archeon.example.demo.service.GreetingService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingController(
    private val service: GreetingService
) {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    fun greeting(name: String): String {
        return service.greeting(name)
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun greeting(): String {
        return service.greeting()
    }
}
