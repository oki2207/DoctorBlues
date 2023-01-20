package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.doctorblues.R
import com.example.doctorblues.adapter.ViewPagerAdapter
import com.example.doctorblues.databinding.FragmentStartBinding
import com.google.android.material.tabs.TabLayoutMediator

class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_start,
            container, false

        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var tabLayout=binding.tabs
        var viewpager = binding.pager
        var forOtherFrag = ForOtherFragment()
        var helpFrag = HelpFragment()
        var homeFrag = HomeFragment()
        var illFrag = IllFragment()
        var selfFrag = SelftestFragment()
        var tipFrag = TippsFragment()
        var fragments= listOf(homeFrag, illFrag, selfFrag, tipFrag, forOtherFrag, helpFrag)

        val viewPagerAdapter = ViewPagerAdapter(this, fragments)
        viewpager.adapter=viewPagerAdapter

        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            tab.text = when (position) {
                0 -> "Home"
                1 -> "Krankheit"
                2 -> "Selbsttest"
                3 -> "Tipps"
                4 -> "Für den Partner"
                5 -> "Hilfe"
                else -> null
            }
        }.attach()


    }
}