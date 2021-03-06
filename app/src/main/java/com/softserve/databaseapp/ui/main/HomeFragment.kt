package com.softserve.databaseapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.softserve.databaseapp.R
import com.softserve.databaseapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding = FragmentHomeBinding.inflate(inflater)
        binding.homeButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToExtraInfoFragment())
        }
        return binding.root
    }


}