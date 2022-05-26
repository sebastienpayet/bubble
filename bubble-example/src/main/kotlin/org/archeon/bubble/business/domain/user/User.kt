package org.archeon.bubble.business.domain.user

import org.archeon.bubble.business.port.bubble.BubbleEntity

class User(
    override var id: String? = null,
    val name: String,
    val age: Int
) : BubbleEntity {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age)"
    }
}
