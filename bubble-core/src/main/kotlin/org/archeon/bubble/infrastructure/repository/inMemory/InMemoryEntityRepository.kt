package org.archeon.bubble.infrastructure.repository.inMemory

import org.archeon.bubble.business.port.bubble.BubbleEntity
import org.archeon.bubble.business.port.repository.read.EntityReadRepository
import org.archeon.bubble.business.port.repository.read.ListCommand
import org.archeon.bubble.business.port.repository.write.EntityWriteRepository
import java.util.*
import javax.enterprise.context.ApplicationScoped

open class InMemoryEntityRepository<T : BubbleEntity> : EntityReadRepository<T>, EntityWriteRepository<T> {

    private val entities: LinkedHashMap<String, T> = LinkedHashMap()

    override fun read(id: String): T {
        return entities.values.first { it.id == id }
    }

    override fun list(command: ListCommand): Set<T> {
        TODO("Not yet implemented")
    }

    override fun save(entity: T): T {
        if (entity.id == null) {
            entity.id = UUID.randomUUID().toString()
        }
        entities[entity.id!!] = entity
        return entity
    }

    override fun delete(id: String) {
        entities.remove(id)
    }
}
