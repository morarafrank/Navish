package com.frankmorara.navish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.frankmorara.navish.databinding.FragmentLoginBinding

class LoginFragment: Fragment(R.layout.fragment_login) {
    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        binding.buttonLogin.setOnClickListener {

            val username = binding.textUsername.text.toString()
            val password = binding.textPassword.text.toString()
            val action = if (username == password){
                LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            }
            else{
                LoginFragmentDirections.actionLoginFragmentToTryAgainFragment(username, password)
            }
            findNavController().navigate(action)
        }
        return binding.root
    }
}