package mw.appeze.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import mw.appeze.R
import mw.appeze.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    lateinit var authBinding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        authBinding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }
}