package org.archeon.bubble.business.port.network.port.read

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.command.ListCommand

interface NetworkReadPort<T : BubbleEntity> {
    fun entryPointRead(id: String): T
    fun entryPointList(command: ListCommand): Set<T>
}
