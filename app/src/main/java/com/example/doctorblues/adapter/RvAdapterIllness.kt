package com.example.doctorblues.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorblues.R
import com.example.doctorblues.data.DataText

class RvAdapterIllness(var contentIllness:MutableList<DataText>): RecyclerView.Adapter<RvAdapterIllness.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var headtext: TextView = itemView.findViewById(R.id.head_text)
        var infotext: TextView = itemView.findViewById(R.id.infotext)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_illness, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        val item = contentIllness[position]
        holder.headtext.text = item.headtext.toString()
        holder.infotext.text = item.infotext.toString()
    }

    override fun getItemCount(): Int {
        return contentIllness.size
    }
}