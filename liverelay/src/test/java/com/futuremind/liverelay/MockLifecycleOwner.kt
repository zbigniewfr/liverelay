package com.futuremind.liverelay

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry


class MockLifecycleOwner : LifecycleOwner {

    private val lifecycleRegistry = LifecycleRegistry(this)

    override fun getLifecycle() = lifecycleRegistry

    fun setState(state: Lifecycle.Event) = lifecycleRegistry.handleLifecycleEvent(state)

}