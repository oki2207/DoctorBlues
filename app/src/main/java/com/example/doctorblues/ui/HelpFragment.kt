package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.doctorblues.R
import com.example.doctorblues.adapter.RvAdapter
import com.example.doctorblues.databinding.FragmentHelpBinding

class HelpFragment: Fragment() {
    private lateinit var binding: FragmentHelpBinding
    private val viewModel: ViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel.getContacts()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_help,
            container, false

        )
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var rvAdapter = RvAdapter()

        binding.rv.adapter = rvAdapter

        viewModel.contacts.observe(viewLifecycleOwner) {

            rvAdapter.contactlist(it)

        }
    }



    fun checkInputPlz (input:String):Boolean{
        if(input.length == 5){
            return true

        } else {
            //hier könnte die Fehlermeldung stehen!!
            return false
        }

    }
}