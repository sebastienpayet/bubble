package org.archeon.bubble.business.port.bubble.read

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.network.port.read.NetworkReadPort
import org.archeon.bubble.business.port.repository.read.EntityReadRepository
import org.archeon.bubble.business.port.repository.read.ListCommand

interface Readable<T: BubbleEntity> {
    val networkGateway: NetworkGateway
    val readRepository: EntityReadRepository<T>
    val networkReadPort: NetworkReadPort<T>

    fun get(id: String): T {
        return readRepository.read(id)
    }

    fun list(listCommand: ListCommand): Set<T> {
        return readRepository.list(listCommand)
    }
}
