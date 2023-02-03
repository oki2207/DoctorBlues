package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doctorblues.R
import com.example.doctorblues.adapter.RvAdapter
import com.example.doctorblues.adapter.RvAdapterHistory
import com.example.doctorblues.databinding.FragmentSelftestBinding

class SelftestFragment:Fragment() {
    private lateinit var binding: FragmentSelftestBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_selftest,
            container, false

        )
        return binding.root
    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var rvAdapterHistory = RvAdapterHistory()
        binding.rvErgebnisse.adapter = rvAdapterHistory



        viewModel.scoreList.observe(viewLifecycleOwner){
            rvAdapterHistory.ergebnisList(it)
        }


        binding.zumtestButton.setOnClickListener{
            findNavController().navigate(StartFragmentDirections.actionStartFragmentToQuestionsFragment())
        }







        }
    }

