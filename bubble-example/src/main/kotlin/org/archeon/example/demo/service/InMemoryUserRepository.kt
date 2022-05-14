package org.archeon.example.demo.service

import org.archeon.bubble.business.port.repository.read.ListCommand

class InMemoryUserRepository: InMemoryEntityRepository<User>() {
    override fun list(command: ListCommand): Set<User> {
        TODO("Not yet implemented")
    }
}
