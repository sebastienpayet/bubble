package org.archeon.bubble.infrastructure.service

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {
    fun greeting(name: String): String {
        return "hello $name"
    }

    fun greeting(): String {
        return "hello world"
    }
}
