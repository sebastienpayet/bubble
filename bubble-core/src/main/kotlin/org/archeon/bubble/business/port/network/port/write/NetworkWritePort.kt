package org.archeon.bubble.business.port.network.port.write

import org.archeon.bubble.business.port.bubble.BubbleEntity

interface NetworkWritePort<T : BubbleEntity> {
    fun entryPointSave(entity: T)
    fun entryPointDelete(id: String)
}
