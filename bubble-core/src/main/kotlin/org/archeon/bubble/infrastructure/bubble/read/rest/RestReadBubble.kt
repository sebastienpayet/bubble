package org.archeon.bubble.infrastructure.bubble.read.rest

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.bubble.read.Readable
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.read.ListCommand
import org.archeon.bubble.infrastructure.repository.inMemory.InMemoryEntityRepository
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
open class RestReadBubble<T : BubbleEntity>(
    override val address: String? = null,
    override val networkGateway: NetworkGateway,
    override val readRepository: InMemoryEntityRepository<T>,
) : Readable<T> {
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    override fun entryPointRead(id: String): T {
        return readRepository.read(id)
    }
    @Path("/list")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    override fun entryPointList(command: ListCommand): List<T> {
        TODO("Not yet implemented")
    }
}
