package org.archeon.example.demo.service

import org.archeon.bubble.business.port.bubble.read.ReadableBubble
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.read.EntityReadRepository
import org.archeon.bubble.business.port.repository.read.ListCommand
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/user")
class UserBubble(
    override val networkGateway: NetworkGateway,
    override val readRepository: EntityReadRepository<User>
) : ReadableBubble<User> {

    override val address: String = ""

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    override fun entryPointRead(id: String): User {
        TODO("Not yet implemented")
    }

    @Path("/list")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    override fun entryPointList(command: ListCommand): List<User> {
        TODO("Not yet implemented")
    }

}
