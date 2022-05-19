package org.archeon.bubble.business.port.event

interface BubbleInputEvent: BubbleEvent {
    val entityId: String
}
