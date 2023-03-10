package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.doctorblues.R
import com.example.doctorblues.adapter.RvAdapterTest
import com.example.doctorblues.adapter.answerNumber
import com.example.doctorblues.databinding.FragmentQuestionsBinding
import com.example.doctorblues.databinding.FragmentSelftestBinding
import com.example.doctorblues.ui.StartFragmentDirections.Companion.actionStartFragmentToErgebnisFragment

class QuestionsFragment: Fragment() {
    private lateinit var binding: FragmentQuestionsBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel.getQuestion()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_questions,
            container, false

        )
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var rvAdapterTest = RvAdapterTest()

        binding.rvtest.adapter = rvAdapterTest

        viewModel.questions.observe(viewLifecycleOwner) {

            rvAdapterTest.questionlist(it)

                }

        binding.ergebnisButton.setOnClickListener {
            findNavController().navigate(QuestionsFragmentDirections.actionQuestionsFragmentToErgebnisFragment(
                answerNumber))
            println(answerNumber)
            answerNumber = 0
        }
    }
}

