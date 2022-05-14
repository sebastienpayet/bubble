package org.archeon.example.demo.service

import org.archeon.bubble.infrastructure.bubble.read.rest.RestReadBubble
import org.archeon.bubble.infrastructure.network.gateway.rest.RestNetworkGateway
import org.archeon.bubble.infrastructure.repository.inMemory.InMemoryEntityRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserBubble : RestReadBubble<User>(
    readRepository = InMemoryEntityRepository(),
    networkGateway = RestNetworkGateway()
)
