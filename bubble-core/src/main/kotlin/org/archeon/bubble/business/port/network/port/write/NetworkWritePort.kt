package org.archeon.bubble.business.port.network.port.write

import io.vertx.core.spi.launcher.Command
import org.archeon.bubble.business.port.bubble.BubbleEntity

interface NetworkWritePort<T : BubbleEntity> {
    fun manageAsyncInput(command: Command)
}
