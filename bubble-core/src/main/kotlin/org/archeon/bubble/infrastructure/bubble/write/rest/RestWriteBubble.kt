package org.archeon.bubble.infrastructure.bubble.write.rest

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.bubble.write.Writable
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.write.EntityWriteRepository

class RestWriteBubble<T : BubbleEntity>(
    override val address: String?,
    override val inputEntitiesClasses: List<BubbleEntity>,
    override val networkGateway: NetworkGateway,
    override val writeRepository: EntityWriteRepository<T>
) : Writable<T> {
    override fun throwSaveEvent(entity: T) {
        TODO("Not yet implemented")
    }

    override fun throwDeleteEvent(entity: T) {
        TODO("Not yet implemented")
    }

    override fun entryPointSave(entity: T) {
        TODO("Not yet implemented")
    }

    override fun entryPointDelete(id: String) {
        TODO("Not yet implemented")
    }
}
