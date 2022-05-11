package org.archeon.bubble.business.domain.bubble

import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.bubble.Writable
import org.archeon.bubble.business.port.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.EntityWriteRepository

class WriteBubble<T: BubbleEntity>(
    override var id: String? = null,
    override val address: String,
    override val inputEntitiesClasses: List<String>,
    override val networkGateway: NetworkGateway,
    override val writeRepository: EntityWriteRepository<T>
) : Writable<T>, Bubble {
    override fun delete(id: String) {
        writeRepository.delete(id)
    }

    override fun manageInput(input: BubbleEntity) {
        TODO("Not yet implemented")
    }

    override fun manageDelete(input: BubbleEntity) {
        TODO("Not yet implemented")
    }

    override fun sendDelete(entity: T) {
        TODO("Not yet implemented")
    }

    override fun sendUpdate(entity: T) {
        TODO("Not yet implemented")
    }
}
