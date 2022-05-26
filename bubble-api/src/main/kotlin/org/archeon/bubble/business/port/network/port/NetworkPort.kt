package org.archeon.bubble.business.port.network.port

import org.archeon.bubble.business.port.bubble.BubbleEntity

interface NetworkPort<T: BubbleEntity> {
    val address: String?
}
