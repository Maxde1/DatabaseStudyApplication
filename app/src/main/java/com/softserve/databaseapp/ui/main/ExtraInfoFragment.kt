package com.softserve.databaseapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.softserve.databaseapp.R
import com.softserve.databaseapp.databinding.FragmentExtraInfoBinding

class ExtraInfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentExtraInfoBinding.inflate(inflater)
        binding.textExtraInfo.text = "hello"




        return binding.root
    }
}