package locle.android.com.mvvm_cleanarchitechture.common.base

import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<BV : BaseViewModel, VB : ViewBinding> : AppCompatActivity() {

}