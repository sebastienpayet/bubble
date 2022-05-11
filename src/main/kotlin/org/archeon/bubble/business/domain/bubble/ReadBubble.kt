package org.archeon.bubble.business.domain.bubble

import org.archeon.bubble.business.port.BubbleEntity
import org.archeon.bubble.business.port.Bubbleable
import org.archeon.bubble.business.port.Readable
import java.net.URL

class ReadBubble<T : BubbleEntity>(
    override val outputEntity: T,
    override val url: URL
) : Readable<T>, Bubbleable {

    override fun get(id: String): T {
        TODO("Not yet implemented")
    }

    override fun scanBubbles(): List<Bubbleable> {
        TODO("Not yet implemented")
    }

    override fun sendSubscription(url: URL) {
        TODO("Not yet implemented")
    }

    override fun manageSubscription() {
        TODO("Not yet implemented")
    }
}
