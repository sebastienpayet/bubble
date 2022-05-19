package org.archeon.bubble.infrastructure.command

import org.archeon.bubble.business.port.command.RegisterCommand

class RestRegisterCommand(override val address: String, override val entityType: String) : RegisterCommand
