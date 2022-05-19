package org.archeon.bubble.business.port.network.port

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.network.gateway.NetworkGateway

interface NetworkPort<T: BubbleEntity> {
    val networkGateway: NetworkGateway
}
