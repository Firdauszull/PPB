package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.MyContactItemBinding

class MyContactAdapter (private val listStudent : ArrayList<MyContact>) :RecyclerView.Adapter<MyContactAdapter.ViewHolder>(){
    class ViewHolder(val binding: MyContactItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = MyContactItemBinding.inflate(LayoutInflater.from(parent.context),parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.Nama.text = listStudent[position].Nama
        holder.binding.NoHp.text = listStudent[position].NoHp
    }
}