package com.frankmorara.navish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frankmorara.navish.databinding.FragmentExitBinding

class ExitFragment: Fragment(R.layout.fragment_exit) {
    lateinit var binding: FragmentExitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentExitBinding.inflate(layoutInflater)
        return binding.root
    }
}