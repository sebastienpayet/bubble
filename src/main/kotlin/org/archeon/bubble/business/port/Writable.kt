package org.archeon.bubble.business.port

interface Writable<T: BubbleEntity> {
    val inputEntities: List<BubbleEntity>

    fun delete(id: String)
    fun manageInput(input: BubbleEntity)

    fun propagateChange(entity: T)
}
