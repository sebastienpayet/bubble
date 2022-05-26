package org.archeon.bubble.business.port.bubble.write

import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.network.port.write.NetworkWritePort
import org.archeon.bubble.business.port.repository.write.EntityWriteRepository

interface WritableBubble<T : BubbleEntity>: NetworkWritePort<T>, Bubble {
    val networkGateway: NetworkGateway
    val writeRepository: EntityWriteRepository<T>
}
