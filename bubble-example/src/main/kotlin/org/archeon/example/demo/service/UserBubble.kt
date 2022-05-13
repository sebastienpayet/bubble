package org.archeon.example.demo.service

import org.archeon.bubble.infrastructure.bubble.read.rest.RestReadBubble
import org.archeon.bubble.infrastructure.network.gateway.rest.RestNetworkGateway
import org.archeon.bubble.infrastructure.network.port.read.RestNetworkReadPort
import org.archeon.bubble.infrastructure.repository.inMemory.InMemoryEntityRepository

class UserBubble: RestReadBubble<User>(
    address = "locahost:53530",
    readRepository = InMemoryEntityRepository(),
    networkGateway = RestNetworkGateway(),
    networkReadPort = RestNetworkReadPort()
)
