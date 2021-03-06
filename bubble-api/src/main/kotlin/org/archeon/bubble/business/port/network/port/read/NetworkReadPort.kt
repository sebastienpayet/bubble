package org.archeon.bubble.business.port.network.port.read

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.command.ListCommand
import org.archeon.bubble.business.port.network.port.NetworkPort

interface NetworkReadPort<T : BubbleEntity> : NetworkPort<T> {
    fun read(id: String): T
    fun list(command: ListCommand): Set<T>
}
