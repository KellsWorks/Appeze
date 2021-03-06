package mw.appeze.auth.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import mw.appeze.MainActivity
import mw.appeze.R
import mw.appeze.databinding.FragmentLoginBinding
import mw.appeze.ui.agent.AgentActivity
import mw.appeze.utils.AsteriskPasswordTransformationMethod

open class LoginFragment : Fragment() {

    private lateinit var loginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        loginBinding = FragmentLoginBinding.inflate(inflater, container, false)
        loginBinding.fragment = this@LoginFragment

        return loginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.logInAsList,
            android.R.layout.simple_spinner_item
        ).also { adapter ->

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            loginBinding.loginAsSpinner.adapter = adapter

        }

        loginBinding.loginPassword.transformationMethod = AsteriskPasswordTransformationMethod()
    }

    open fun toRegister(view: View){
        findNavController().navigate(R.id.login_to_register)
    }

    open fun toForgotPassword(view: View){
        findNavController().navigate(R.id.login_to_forgotPassword)
    }

    open fun processLogin(view: View){
        startActivity(
            Intent(
            requireActivity(),
            MainActivity::class.java
        )
        )
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        loginBinding.loginPassword.transformationMethod = AsteriskPasswordTransformationMethod()
    }

}