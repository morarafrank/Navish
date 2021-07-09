package com.frankmorara.navish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frankmorara.navish.databinding.FragmentSearchBinding

class SearchFragment: Fragment(R.layout.fragment_search) {
    lateinit var binding: FragmentSearchBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater)
        return binding.root

    }

}