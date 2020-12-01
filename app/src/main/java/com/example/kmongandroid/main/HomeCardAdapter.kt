package com.example.kmongandroid.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kmongandroid.R

class HomeCardAdapter (private val context: Context) : RecyclerView.Adapter<HomeCardViewHolder>() {

    var data = mutableListOf<HomeCardData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCardViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_home_card, parent, false)
        return HomeCardViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeCardViewHolder, position: Int) {
        val positionInData : Int = position % data.size
        holder.onBind(data[positionInData])
    }

    override fun getItemCount(): Int {
        return Int.MAX_VALUE
    }
}