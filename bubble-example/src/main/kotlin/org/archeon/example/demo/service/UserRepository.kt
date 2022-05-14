package org.archeon.example.demo.service

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository: InMemoryEntityRepository<User>()
