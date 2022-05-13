package org.archeon.bubble.business.port.network.port.read

import org.archeon.bubble.business.port.bubble.BubbleEntity

interface NetworkReadPort<T : BubbleEntity> {
    fun manageOutput(entity: T): T
    fun manageOutputs(entities: List<T>): List<T>
}
