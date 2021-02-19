package locle.android.com.mvvm_cleanarchitechture.extension

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager


/**
 * extention class handle base view forView
 * */

fun View.visible() {
    this.run {
        visibility = View.VISIBLE
    }
}

fun View.gone() {
    this.run {
        visibility = View.GONE
    }
}

fun View.hideKeyboard() {
    val imm: InputMethodManager =
        context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}

fun View.showKeyBoard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    if (requestFocus()) imm.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
}