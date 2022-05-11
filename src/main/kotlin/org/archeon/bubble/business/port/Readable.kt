package org.archeon.bubble.business.port

interface Readable<T: BubbleEntity> {
    fun get(id: String): T
}
