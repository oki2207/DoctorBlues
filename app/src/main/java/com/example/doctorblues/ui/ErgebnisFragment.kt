package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.doctorblues.R
import com.example.doctorblues.databinding.FragmentErgebnisBinding

class ErgebnisFragment: Fragment() {
    private lateinit var binding: FragmentErgebnisBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_ergebnis,
            container, false

        )
        return binding.root
    }
}



