package com.example.doctorblues.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorblues.R
import com.example.doctorblues.data.model.Contacts

class RvAdapter(): RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    var content:List<Contacts> = listOf()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name: TextView = itemView.findViewById(R.id.name_text)
        var adresse: TextView = itemView.findViewById(R.id.adress_text)
        var number: TextView = itemView.findViewById(R.id.phone_text)
        var surname: TextView = itemView.findViewById(R.id.surname_text)
        var plz: TextView = itemView.findViewById(R.id.plz_text)
        var city: TextView = itemView.findViewById(R.id.city_text)
        var titel: TextView = itemView.findViewById(R.id.titel_text)
    }

        fun contactlist(list: List<Contacts>) {
            content = list
            notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_adapter,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Contacts = content[position]
        holder.name.text = item.name
        holder.adresse.text = item.adress
        holder.number.text = item.phone
        holder.surname.text = item.surname
        holder.plz.text = item.plz
        holder.city.text = item.city
        holder.titel.text = item.titel

    }

    override fun getItemCount(): Int {
        return content.size
    }

    }

