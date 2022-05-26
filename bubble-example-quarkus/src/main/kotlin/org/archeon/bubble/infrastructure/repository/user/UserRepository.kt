package org.archeon.bubble.infrastructure.repository.user

import org.archeon.bubble.business.domain.user.User
import org.archeon.bubble.infrastructure.repository.InMemoryEntityRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository: InMemoryEntityRepository<User>()
