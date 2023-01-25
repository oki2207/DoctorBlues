package com.example.doctorblues.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorblues.R
import com.example.doctorblues.data.User

class RvAdapter(var content:MutableList<User>): RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var pic: ImageView = itemView.findViewById(R.id.fly_image)
        var name: TextView = itemView.findViewById(R.id.name_user)
        var adresse: TextView = itemView.findViewById(R.id.adresse_text)
        var number: TextView = itemView.findViewById(R.id.numer_text)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_adapter,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = content[position]
        holder.name.text = item.name.toString()
        holder.adresse.text = item.adresse.toString()
        holder.number.text = item.phoneNumber.toString()
        holder.pic.setImageResource(R.drawable.flys)
        
    }

    override fun getItemCount(): Int {
        return content.size
    }

    }

