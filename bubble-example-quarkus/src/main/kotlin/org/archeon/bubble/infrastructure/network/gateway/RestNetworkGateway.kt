package org.archeon.bubble.infrastructure.network.gateway

import org.archeon.bubble.business.port.command.RegisterCommand
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class RestNetworkGateway {

	private val FIRST_PORT = 53000
	private val HOST = "http://localhost"
	private val producersByType = mutableMapOf<String, MutableSet<String>>()
	private val consumersByType = mutableMapOf<String, MutableSet<String>>()

	fun registerBubble(command: RegisterCommand) {
		// producers
		if (producersByType[command.produceEntityType] == null) {
			producersByType[command.produceEntityType] = mutableSetOf(command.address)
		} else {
			producersByType[command.produceEntityType]?.add(command.address)
		}

		// consumers
	}
}
