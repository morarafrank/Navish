package com.frankmorara.navish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.frankmorara.navish.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.buttonContinue.setOnClickListener {
//         findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            findNavController().navigate(action)
        }
        return binding.root
    }
}