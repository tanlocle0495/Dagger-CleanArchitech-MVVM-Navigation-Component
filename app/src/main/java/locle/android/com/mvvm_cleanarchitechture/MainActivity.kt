package locle.android.com.mvvm_cleanarchitechture

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import locle.android.com.mvvm_cleanarchitechture.extension.circleImage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.image)
        image.circleImage("https://images.unsplash.com/photo-1612831660013-4a977abfb708?ixid=MXwxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2125&q=80")
    }
}