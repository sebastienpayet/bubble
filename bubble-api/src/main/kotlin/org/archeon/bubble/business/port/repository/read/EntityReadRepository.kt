package org.archeon.bubble.business.port.repository.read

import org.archeon.bubble.business.port.command.ListCommand

interface EntityReadRepository<T> {
    fun read(id: String): T
    fun list(command: ListCommand): Set<T>
}
