package org.archeon.bubble.business.port.gateway

import org.archeon.bubble.business.port.bubble.Bubble

interface NetworkGateway {
    fun fetchBubbles(): Set<Bubble>
    fun register(bubble: Bubble)
}
