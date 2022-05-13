package org.archeon.bubble.business.port.bubble.write

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.network.port.write.NetworkWritePort
import org.archeon.bubble.business.port.repository.write.EntityWriteRepository

interface Writable<T : BubbleEntity> {
    val inputEntitiesClasses: List<BubbleEntity>
    val networkGateway: NetworkGateway
    val networkWritePort: NetworkWritePort<T>
    val writeRepository: EntityWriteRepository<T>

    fun delete(id: String) {
        writeRepository.delete(id)
    }
    fun manageInput(input: BubbleEntity)

    fun throwInputEvent(entity: T)
    fun throwDeleteEvent(entity: T)
}
