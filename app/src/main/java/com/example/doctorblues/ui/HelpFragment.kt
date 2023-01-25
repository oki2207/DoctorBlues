package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorblues.R
import com.example.doctorblues.adapter.RvAdapter
import com.example.doctorblues.data.User
import com.example.doctorblues.databinding.FragmentHelpBinding
import com.example.doctorblues.databinding.FragmentIllBinding

class HelpFragment: Fragment() {
    private lateinit var binding: FragmentHelpBinding
    private lateinit var rv: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: RvAdapter
    private lateinit var content: MutableList<User>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_help,
            container, false

        )
        return binding.root
    }

    private fun initRecyclerView() {
        rv = binding.rv
        adapter = RvAdapter(content)
        rv.layoutManager = layoutManager
        rv.adapter = adapter
        rv.addItemDecoration(DividerItemDecoration(rv.context,layoutManager.orientation))
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fun initContent() {
            
        }

            content = mutableListOf<User>()
            content.add(
                User(
                    content.size + 1,
                    "Dr.",
                    "Feldmann",
                    "Musternmannstraße 34 \n47398 Duisburg",
                    "0203-4563896",
                    R.drawable.flys

                )
            )
            content.add(
                User(
                    content.size + 1,
                    "Carlo",
                    "Colucci",
                    "carly111@gmail.com",
                    "0171-45833895",
                    R.drawable.flys
                )

                )
            content.add(
                User(
                    content.size + 1,
                    "Dr.",
                    "Weihnachtsmann",
                    "Klostermannstraße 34 \n47240 Duisburg",
                    "0152-24122022",
                    R.drawable.flys

                )
                        )

        content.add(
            User(
                content.size + 1,
                "Carlo",
                "Colucci",
                "carly111@gmail.com",
                "0171-45833895",
                R.drawable.flys
            )

        )
        content.add(
            User(
                content.size + 1,
                "Carlo",
                "Colucci",
                "carly111@gmail.com",
                "0171-45833895",
                R.drawable.flys
            )

        )
        content.add(
            User(
                content.size + 1,
                "Rudolf",
                "Weihnachtsmann",
                "nordpolstern@gmail.com",
                "0152-24122022",
                R.drawable.flys

            )
        )
        val rvAdapter=RvAdapter(content)
        binding.rv.adapter=rvAdapter


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