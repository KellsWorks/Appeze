package mw.appeze.ui.agent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import mw.appeze.R
import mw.appeze.databinding.ActivityAgentBinding

class AgentActivity : AppCompatActivity() {

    private lateinit var agentBinding: ActivityAgentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent)

        agentBinding = ActivityAgentBinding.inflate(layoutInflater)
        setContentView(agentBinding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.agent_nav_fragment) as NavHostFragment

        NavigationUI.setupWithNavController(agentBinding.bottomNav, navHostFragment.navController)

    }

}