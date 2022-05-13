package org.archeon.example.demo.service

import org.archeon.bubble.business.port.repository.read.ListCommand
import org.archeon.bubble.infrastructure.repository.inMemory.InMemoryEntityRepository

class InMemoryUserRepository: InMemoryEntityRepository<User>() {
    override fun list(command: ListCommand): Set<User> {
        TODO("Not yet implemented")
    }
}
