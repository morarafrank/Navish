package com.frankmorara.navish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frankmorara.navish.databinding.FragmentTermsBinding

class TermsFragment: Fragment(R.layout.fragment_terms) {
    lateinit var binding: FragmentTermsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTermsBinding.inflate(layoutInflater)
        return binding.root

    }
}