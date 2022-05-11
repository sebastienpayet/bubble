package org.archeon.bubble.business.domain.bubble

import org.archeon.bubble.business.port.BubbleEntity
import org.archeon.bubble.business.port.Bubbleable
import org.archeon.bubble.business.port.Writable
import java.net.URL

class WriteBubble(
    override val outputEntity: BubbleEntity,
    override val url: URL,
    override val inputEntities: List<BubbleEntity>
) : Writable, Bubbleable {
    override fun scanBubbles(): List<Bubbleable> {
        TODO("Not yet implemented")
    }

    override fun sendSubscription(url: URL) {
        TODO("Not yet implemented")
    }

    override fun manageSubscription() {
        TODO("Not yet implemented")
    }

    override fun delete(id: String) {
        TODO("Not yet implemented")
    }

    override fun manageInput(input: BubbleEntity) {
        TODO("Not yet implemented")
    }

    override fun propagateChange(entity: BubbleEntity) {
        TODO("Not yet implemented")
    }
}
