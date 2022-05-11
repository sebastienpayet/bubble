package org.archeon.example.demo.service

import mu.KLogging
import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.gateway.NetworkGateway
import java.util.UUID

class InMemoryNetworkGateway(
    private val bubbles: MutableMap<String, Bubble> = mutableMapOf()
) : NetworkGateway {

    override fun fetchBubbles(): Set<Bubble> {
        logger.debug("fetching ${bubbles.size} bubbles")
        return bubbles.values.toSet()
    }

    override fun register(bubble: Bubble) {
        bubble.id = UUID.randomUUID().toString()
        bubbles[bubble.id!!] = bubble
    }

    companion object : KLogging()
}
