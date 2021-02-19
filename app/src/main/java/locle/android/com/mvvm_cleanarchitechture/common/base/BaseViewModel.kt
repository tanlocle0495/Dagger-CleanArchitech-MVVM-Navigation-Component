package locle.android.com.mvvm_cleanarchitechture.common.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    val loading = MutableLiveData<Boolean>()
}

