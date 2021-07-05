package com.frankmorara.navish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.frankmorara.navish.databinding.FragmentWelcomeBinding

class WelcomeFragment: Fragment(R.layout.fragment_welcome) {
    lateinit var binding: FragmentWelcomeBinding
    private val args: WelcomeFragmentArgs by navArgs()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentWelcomeBinding.inflate(layoutInflater)

        binding.textviewUsername.text = args.username
        binding.textviewPassword.text = args.password
        binding.buttonOk.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }
}