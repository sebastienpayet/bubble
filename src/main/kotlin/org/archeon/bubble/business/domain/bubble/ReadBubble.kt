package org.archeon.bubble.business.domain.bubble

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.bubble.Readable
import org.archeon.bubble.business.port.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.EntityReadRepository
import org.archeon.bubble.business.port.repository.ListCommand

class ReadBubble<T : BubbleEntity>(
    override val outputEntity: T,
    override val address: String,
    override val id: String,
    override val networkGateway: NetworkGateway,
    override val readRepository: EntityReadRepository<T>
) : Readable<T>, Bubble {
    override fun get(id: String): T {
        TODO("Not yet implemented")
    }

    override fun list(listCommand: ListCommand): Set<T> {
        TODO("Not yet implemented")
    }
}
