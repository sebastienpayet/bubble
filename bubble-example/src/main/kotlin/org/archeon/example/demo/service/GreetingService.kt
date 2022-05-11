package org.archeon.example.demo.service

import org.archeon.bubble.business.domain.bubble.ReadBubble
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {
    val userBubble = ReadBubble(
        address = "locahost:53530",
        readRepository = InMemoryUserRepository(),
        networkGateway = InMemoryNetworkGateway()
    )

    fun greeting(name: String): String {
        return "hello $name"
    }

    fun greeting(): String {
        userBubble.networkGateway.fetchBubbles().forEach{
            println(it.toString())
        }

        return "hello world"
    }
}
