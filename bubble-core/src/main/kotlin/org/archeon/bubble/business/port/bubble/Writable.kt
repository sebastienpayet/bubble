package org.archeon.bubble.business.port.bubble

import org.archeon.bubble.business.port.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.EntityWriteRepository

interface Writable<T : BubbleEntity> {
    val inputEntitiesClasses: List<String>
    val networkGateway: NetworkGateway
    val writeRepository: EntityWriteRepository<T>

    fun delete(id: String)
    fun manageInput(input: BubbleEntity)
    fun manageDelete(input: BubbleEntity)
    fun sendUpdate(entity: T)
    fun sendDelete(entity: T)
}
