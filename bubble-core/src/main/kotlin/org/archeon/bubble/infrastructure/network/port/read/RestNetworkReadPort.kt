package org.archeon.bubble.infrastructure.network.port.read

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.network.port.read.NetworkReadPort

class RestNetworkReadPort<T: BubbleEntity>: NetworkReadPort<T> {


    override fun manageOutput(entity: T): T {
        TODO("Not yet implemented")
    }

    override fun manageOutputs(entities: List<T>): List<T> {
        TODO("Not yet implemented")
    }
}
