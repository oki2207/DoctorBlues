package com.example.doctorblues.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorblues.R
import com.example.doctorblues.data.model.History
import com.example.doctorblues.data.model.Questions
import com.example.doctorblues.data.model.Score

class RvAdapterHistory() : RecyclerView.Adapter<RvAdapterHistory.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var date: TextView = itemView.findViewById(R.id.date_text)
        var score: TextView = itemView.findViewById(R.id.result_text)
    }

    private var content: List<Score> = listOf()

    fun ergebnisList(list: List<Score>) {
        content = list
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = content[position]

        holder.date.text = item.date
        holder.score.text = item.score.toString()

    }

    override fun getItemCount(): Int {
        return content.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_history, parent, false)
        return ViewHolder(view)
    }
}