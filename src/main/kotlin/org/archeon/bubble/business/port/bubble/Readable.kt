package org.archeon.bubble.business.port.bubble

import org.archeon.bubble.business.port.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.EntityReadRepository
import org.archeon.bubble.business.port.repository.ListCommand

interface Readable<T: BubbleEntity> {
    val outputEntity: T
    val networkGateway: NetworkGateway
    val readRepository: EntityReadRepository<T>

    fun get(id: String): T
    fun list(listCommand: ListCommand): Set<T>
}
