package org.archeon.bubble.infrastructure.bubble.write.user

import org.archeon.bubble.business.domain.user.User
import org.archeon.bubble.business.port.bubble.write.WritableBubble
import org.archeon.bubble.business.port.event.BubbleInputEvent
import org.archeon.bubble.business.port.event.BubbleOutputEvent
import org.archeon.bubble.business.port.repository.write.EntityWriteRepository
import org.archeon.bubble.infrastructure.command.RestRegisterCommand
import org.archeon.bubble.infrastructure.network.gateway.RestNetworkGateway

class UserWriteBubble(
    private val restNetworkGateway: RestNetworkGateway,
    override val writeRepository: EntityWriteRepository<User>
) : WritableBubble<User> {

    private val address: String = "http://localhost:8080/user"

    override fun handleInputEvent(event: BubbleInputEvent) {
        TODO("Not yet implemented")
    }

    override fun handleOutputEvent(event: BubbleOutputEvent) {
        TODO("Not yet implemented")
    }

    override fun handleSynchronousInputEvent(event: BubbleInputEvent): User {
        TODO("Not yet implemented")
    }

    override fun subscribe() {
        restNetworkGateway.registerBubble(RestRegisterCommand(address, "user", emptySet()))
    }
}
