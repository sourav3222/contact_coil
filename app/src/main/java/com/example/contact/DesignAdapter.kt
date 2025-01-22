package com.example.contact

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.contact.databinding.ItemDesignBinding

class DesignAdapter(private val users: List<User>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
       val binding = ItemDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val user = users[position]

       holder.binding.nameTV.text = user.name
        holder.binding.phnTV.text = user.phone


    }

    override fun getItemCount(): Int {
      return users.size
    }


}