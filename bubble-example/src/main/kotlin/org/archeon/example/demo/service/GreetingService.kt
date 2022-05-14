package org.archeon.example.demo.service

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    private val userBubble = UserBubble()

    fun greeting(name: String): String {
        userBubble.entryPointList(UserListCommand()).forEach { println(it) }
        return "hello $name"
    }

    fun greeting(): String {
        return "hello world"
    }
}
