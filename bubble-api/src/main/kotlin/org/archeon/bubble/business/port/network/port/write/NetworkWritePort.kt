package org.archeon.bubble.business.port.network.port.write

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.event.BubbleInputEvent
import org.archeon.bubble.business.port.event.BubbleOutputEvent

interface NetworkWritePort<T : BubbleEntity> {
    fun handleInputEvent(event: BubbleInputEvent)
    fun handleOutputEvent(event: BubbleOutputEvent)
    fun handleSynchronousInputEvent(event: BubbleInputEvent): T
}
