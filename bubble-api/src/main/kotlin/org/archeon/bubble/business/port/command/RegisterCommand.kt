package org.archeon.bubble.business.port.command

interface RegisterCommand: Command {
	val address: String
	val produceEntityType: String
	val consumeEntityTypes: Set<String>
}
