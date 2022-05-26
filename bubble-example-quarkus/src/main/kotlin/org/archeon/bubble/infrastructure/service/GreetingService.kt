package org.archeon.bubble.infrastructure.service

import org.archeon.bubble.infrastructure.bubble.read.user.UserListCommand
import org.archeon.bubble.infrastructure.bubble.read.user.UserReadBubble
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService(
    private val userBubble: UserReadBubble
) {

    fun greeting(name: String): String {
        userBubble.list(UserListCommand()).forEach { println(it) }
        return "hello $name"
    }

    fun greeting(): String {
        return "hello world"
    }
}
