package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.doctorblues.R
import com.example.doctorblues.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container, false

        )
        return binding.root
    }
    var endPoint = 0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView4.text=viewModel.listesp[(0..viewModel.listesp.size-1).random()]

        binding.seekBar2.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.seekbarValTV.text = "Dein Wohlbefinden liegt heute bei ${(progress+0)} von 10"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) { // Am Start
                if (seekBar != null){
                    var startPoint = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) { // Am Ende
                if (seekBar != null){
                    endPoint = seekBar.progress + 1
                }

            }
        })






    }
}
