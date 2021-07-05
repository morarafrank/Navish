package com.frankmorara.navish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.frankmorara.navish.databinding.FragmentTryagainBinding

class TryAgainFragment: Fragment(R.layout.fragment_tryagain) {
    lateinit var binding: FragmentTryagainBinding
    private val args: TryAgainFragmentArgs by navArgs()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTryagainBinding.inflate(layoutInflater)
        binding.textviewUsername1.text = args.username
        binding.textviewPassword1.text = args.password
        binding.buttonTryagain.setOnClickListener {
            findNavController().navigate(TryAgainFragmentDirections.actionTryAgainFragmentToLoginFragment())
        }
        return binding.root
    }
}