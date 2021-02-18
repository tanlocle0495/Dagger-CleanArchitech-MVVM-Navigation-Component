package locle.android.com.mvvm_cleanarchitechture.utils

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

open class Event<out T>(private val content: T) {

    var hasBeenHandled = false
        private set  // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = content
}

// Live Data Ext
fun <T> LiveData<out Event<T>>.observeSingleEvent(
    owner: LifecycleOwner,
    onEventUnhandled: (T) -> Unit
) {
    observe(owner, Observer { it?.getContentIfNotHandled()?.let(onEventUnhandled) })
}
