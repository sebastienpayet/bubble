package org.archeon.example.demo.service

import org.archeon.bubble.business.port.bubble.BubbleEntity

class User(
    override var id: String?,
    val name: String,
    val age: Int
) : BubbleEntity
