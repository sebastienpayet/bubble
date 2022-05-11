package org.archeon.bubble.business.port.gateway

import org.archeon.bubble.business.port.bubble.Bubble

interface NetworkGateway {
    fun fetchBubbles(): List<Bubble>
    fun register(bubble: Bubble)
}
