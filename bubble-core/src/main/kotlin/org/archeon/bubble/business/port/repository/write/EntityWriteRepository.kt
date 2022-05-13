package org.archeon.bubble.business.port.repository.write

interface EntityWriteRepository<T> {
    fun create(entity: T): T
    fun update(entity: T): T
    fun delete(id: String)
}
