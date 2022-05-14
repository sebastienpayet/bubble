package org.archeon.example.demo.service

import org.archeon.bubble.business.port.bubble.Bubble
import org.archeon.bubble.business.port.network.gateway.NetworkGateway
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class RestNetworkGateway : NetworkGateway {

    private val FIRST_PORT = 53000
    private val HOST = "http://localhost"
    private val entitiyTypeByAddress = HashMap<String, String>()

    override fun fetchAllAddresses(): Set<String> {
        TODO("Not yet implemented")
    }

    override fun fetchAllAddressesByEntityType(type: String): Set<String> {
        TODO("Not yet implemented")
    }

    override fun manageRegistration(bubble: Bubble) {
        TODO("Not yet implemented")
    }
}
