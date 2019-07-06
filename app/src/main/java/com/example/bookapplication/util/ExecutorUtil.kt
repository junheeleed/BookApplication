package com.example.bookapplication.util

import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

object ThreadExecutor {
    fun executeSingleThread(runnable: Runnable) {
        Executors.newSingleThreadExecutor().apply {
            execute(runnable)
            shutdown()
        }
    }
}

object MainThreadExecutor: Executor {
    private val handler = android.os.Handler(Looper.getMainLooper())

    override fun execute(runnable: Runnable) {
        handler.post(runnable)
    }
}