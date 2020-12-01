package com.example.kmongandroid.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kmongandroid.R

class MainServiceAdapter(private var context: Context) : RecyclerView.Adapter<MainServiceViewHolder>() {

    var data = mutableListOf<MainServiceData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainServiceViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_main_service, parent, false)
        return MainServiceViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainServiceViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int = data.size
}