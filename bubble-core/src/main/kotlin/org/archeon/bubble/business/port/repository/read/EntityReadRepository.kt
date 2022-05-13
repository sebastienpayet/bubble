package org.archeon.bubble.business.port.repository.read

interface EntityReadRepository<T> {
    fun read(id: String): T
    fun list(command: ListCommand): Set<T>
}
