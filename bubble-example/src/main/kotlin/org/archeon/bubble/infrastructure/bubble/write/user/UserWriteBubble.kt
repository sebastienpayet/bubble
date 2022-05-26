package org.archeon.bubble.infrastructure.bubble.write.user

import org.archeon.bubble.business.domain.user.User
import org.archeon.bubble.business.port.bubble.write.WritableBubble
import org.archeon.bubble.business.port.event.BubbleInputEvent
import org.archeon.bubble.business.port.event.BubbleOutputEvent
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.repository.write.EntityWriteRepository

class UserWriteBubble(
	override val networkGateway: NetworkGateway,
	override val writeRepository: EntityWriteRepository<User>
) : WritableBubble<User> {
	override fun entryPointSave(entity: User) {
		TODO("Not yet implemented")
	}

	override fun entryPointDelete(id: String) {
		TODO("Not yet implemented")
	}

	override fun entryPointManageInputEvent(event: BubbleInputEvent) {
		TODO("Not yet implemented")
	}

	override fun entryPointManageOutputEvent(event: BubbleOutputEvent) {
		TODO("Not yet implemented")
	}

	override fun init() {
		TODO("Not yet implemented")
	}
}
