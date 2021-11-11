package mw.appeze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mw.appeze.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this@MainActivity, AuthActivity::class.java))

    }
}