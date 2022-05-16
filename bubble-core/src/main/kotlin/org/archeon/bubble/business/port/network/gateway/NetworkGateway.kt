package org.archeon.bubble.business.port.network.gateway

import org.archeon.bubble.business.port.bubble.Bubble

interface NetworkGateway {
    fun fetchAllAddresses(): Set<String>
    fun fetchAllAddressesByEntityType(type: String): Set<String>
    fun manageRegistration(bubble: Bubble)
}
