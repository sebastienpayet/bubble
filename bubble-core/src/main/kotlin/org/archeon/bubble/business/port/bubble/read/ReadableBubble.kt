package org.archeon.bubble.business.port.bubble.read

import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.network.port.read.NetworkReadPort
import org.archeon.bubble.business.port.repository.read.EntityReadRepository

interface ReadableBubble<T : BubbleEntity> : NetworkReadPort<T>, Bubble {
    val networkGateway: NetworkGateway
    val readRepository: EntityReadRepository<T>
}
