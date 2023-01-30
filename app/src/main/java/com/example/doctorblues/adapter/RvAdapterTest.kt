package com.example.doctorblues.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorblues.R
import com.example.doctorblues.data.model.Questions

class RvAdapterTest(): RecyclerView.Adapter<RvAdapterTest.ViewHolder>() {

    var content:List<Questions> = listOf()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var answerView: RadioGroup = itemView.findViewById(R.id.answerView)
        var question: TextView = itemView.findViewById(R.id.question_text)
        var answera: TextView = itemView.findViewById(R.id.answera)
        var answerb: TextView = itemView.findViewById(R.id.answerb)
        var answerc: TextView = itemView.findViewById(R.id.answerc)
        var answerd: TextView = itemView.findViewById(R.id.answerd)
    }

    fun questionlist(list: List<Questions>) {
        content = list
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_test,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Questions = content[position]

        holder.question.text = item.questions
        holder.answerb.text = item.answerb
        holder.answerc.text = item.answerc
        holder.answerd.text = item.answerd
        holder.answera.text = item.answera
    }

    override fun getItemCount(): Int {
        return content.size
    }

}

