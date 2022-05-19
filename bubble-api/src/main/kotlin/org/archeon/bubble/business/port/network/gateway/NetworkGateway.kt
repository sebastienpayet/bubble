package org.archeon.bubble.business.port.network.gateway

import org.archeon.bubble.business.port.command.RegisterCommand

interface NetworkGateway {
    fun fetchAllAddresses(): Set<String>
    fun fetchAllAddressesByEntityType(type: String): Set<String>
    fun registerBubble(command: RegisterCommand)
}
