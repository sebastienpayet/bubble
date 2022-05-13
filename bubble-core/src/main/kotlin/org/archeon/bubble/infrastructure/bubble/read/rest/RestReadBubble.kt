package org.archeon.bubble.infrastructure.bubble.read.rest

import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.bubble.read.Readable
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import org.archeon.bubble.business.port.network.port.read.NetworkReadPort
import org.archeon.bubble.infrastructure.repository.inMemory.InMemoryEntityRepository

open class RestReadBubble<T : BubbleEntity>(
    override val address: String? = null,
    override val networkGateway: NetworkGateway,
    override val readRepository: InMemoryEntityRepository<T>,
    override val networkReadPort: NetworkReadPort<T>
) : Readable<T>, Bubble
