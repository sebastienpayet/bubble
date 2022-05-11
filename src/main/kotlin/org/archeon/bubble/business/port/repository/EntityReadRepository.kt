package org.archeon.bubble.business.port.repository

interface EntityReadRepository<T> {
    fun read(id: String): T
    fun list(command: ListCommand): Set<T>
}
