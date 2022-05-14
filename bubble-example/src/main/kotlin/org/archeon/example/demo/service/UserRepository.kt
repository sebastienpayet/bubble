package org.archeon.example.demo.service

import org.archeon.bubble.infrastructure.repository.inMemory.InMemoryEntityRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository: InMemoryEntityRepository<User>()
