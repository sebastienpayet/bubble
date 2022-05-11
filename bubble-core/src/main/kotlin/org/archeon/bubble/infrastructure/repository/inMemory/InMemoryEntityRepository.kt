package org.archeon.bubble.infrastructure.repository.inMemory

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.repository.EntityReadRepository
import org.archeon.bubble.business.port.repository.EntityWriteRepository
import java.util.*

abstract class InMemoryEntityRepository<T: BubbleEntity>: EntityReadRepository<T>, EntityWriteRepository<T> {

    private val entities: LinkedHashMap<String, T> = LinkedHashMap()

    override fun read(id: String): T {
        return entities.values.first { it.id == id }
    }

    override fun create(entity: T): T {
        if (entity.id == null) {
            entity.id = UUID.randomUUID().toString()
        }
        entities[entity.id!!] = entity
        return entity
    }

    override fun update(entity: T): T {
        entities[entity.id!!] = entity
        return entity
    }

    override fun delete(id: String) {
        entities.remove(id)
    }
}