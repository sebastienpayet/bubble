package org.archeon.bubble.infrastructure.bubble.read.user

import org.archeon.bubble.business.domain.user.User
import org.archeon.bubble.business.port.bubble.read.ReadableBubble
import org.archeon.bubble.business.port.command.ListCommand
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.infrastructure.repository.user.UserRepository
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/user")
class UserReadBubble(
    override val networkGateway: NetworkGateway,
    override val readRepository: UserRepository
) : ReadableBubble<User> {

    override val address: String = ""

    init {
        readRepository.save(
            User(name = "fake user", age = 42)
        )
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    override fun entryPointRead(id: String): User {
        TODO("Not yet implemented")
    }

    @Path("/list")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    override fun entryPointList(command: ListCommand): Set<User> {
       return readRepository.list(command)
    }
}
