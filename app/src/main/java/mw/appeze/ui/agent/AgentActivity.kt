package mw.appeze.ui.agent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import mw.appeze.R
import mw.appeze.databinding.ActivityAgentBinding

class AgentActivity : AppCompatActivity() {

    private lateinit var agentBinding: ActivityAgentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent)

        agentBinding = DataBindingUtil.setContentView(this, R.layout.activity_agent)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.agent_nav_fragment) as NavHostFragment

        agentBinding.bottomNav.setupWithNavController(navHostFragment.navController)
    }
}