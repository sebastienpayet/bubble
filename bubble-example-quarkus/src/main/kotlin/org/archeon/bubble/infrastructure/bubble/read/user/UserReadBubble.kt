package org.archeon.bubble.infrastructure.bubble.read.user

import org.archeon.bubble.business.domain.user.User
import org.archeon.bubble.business.port.bubble.read.ReadableBubble
import org.archeon.bubble.business.port.command.ListCommand
import org.archeon.bubble.infrastructure.command.RestRegisterCommand
import org.archeon.bubble.infrastructure.network.gateway.RestNetworkGateway
import org.archeon.bubble.infrastructure.repository.user.UserRepository
import javax.annotation.PostConstruct
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/user")
class UserReadBubble(
    val restNetworkGateway: RestNetworkGateway,
    override val readRepository: UserRepository
) : ReadableBubble<User> {

    override val address: String = "http://localhost:8080/user"
    @PostConstruct
    override fun subscribe() {
        readRepository.save(
            User(name = "fake user", age = 42)
        )
        restNetworkGateway.registerBubble(RestRegisterCommand(address, "user", emptySet()))
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    override fun read(id: String): User {
        return readRepository.read(id)
    }

    @Path("/list")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    override fun list(command: ListCommand): Set<User> {
       return readRepository.list(command)
    }
}
