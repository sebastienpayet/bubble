package org.archeon.bubble.infrastructure.network.gateway

import org.archeon.bubble.business.port.command.RegisterCommand
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class RestNetworkGateway : NetworkGateway {

	private val FIRST_PORT = 53000
	private val HOST = "http://localhost"
	private val addressesByType = mutableMapOf<String, MutableSet<String>>()

	override fun fetchAllAddresses(): Set<String> {
		return addressesByType.values.flatten().toSet()
	}

	override fun fetchAllAddressesByEntityType(type: String): Set<String> {
		return addressesByType[type] ?: emptySet()
	}

	override fun registerBubble(command: RegisterCommand) {
		if (addressesByType[command.entityType] == null) {
			addressesByType[command.entityType] = mutableSetOf(command.address)
		} else {
			addressesByType[command.entityType]?.add(command.address)
		}
	}
}
