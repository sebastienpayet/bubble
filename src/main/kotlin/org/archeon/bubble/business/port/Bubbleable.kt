package org.archeon.bubble.business.port

import java.net.URL

interface Bubbleable {
    val outputEntity: BubbleEntity
    val url: URL

    fun scanBubbles(): List<Bubbleable>
    fun sendSubscription(url: URL, bubble: Bubbleable)
    fun receiveSubscription(bubble: Bubbleable)
}
