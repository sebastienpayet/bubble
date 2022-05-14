package org.archeon.bubble.business.port.repository.write

interface EntityWriteRepository<T> {
    fun save(entity: T): T

    fun delete(id: String)
}
