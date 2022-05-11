package org.archeon.bubble.business.domain.bubble

import mu.KLogging
import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.bubble.Readable
import org.archeon.bubble.business.port.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.EntityReadRepository
import org.archeon.bubble.business.port.repository.ListCommand

class ReadBubble<T : BubbleEntity>(
    override var id: String? = null,
    override val address: String,
    override val networkGateway: NetworkGateway,
    override val readRepository: EntityReadRepository<T>
) : Readable<T>, Bubble {

    init {
        networkGateway.register(this)
    }

    override fun get(id: String): T {
        return readRepository.read(id)
    }

    override fun list(listCommand: ListCommand): Set<T> {
        return readRepository.list(listCommand)
    }

    companion object : KLogging()
}
