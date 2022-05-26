package org.archeon.bubblespring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BubbleSpringApplication

fun main(args: Array<String>) {
	runApplication<BubbleSpringApplication>(*args)
}
