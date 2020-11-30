package com.example.kmongandroid.detail

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kmongandroid.R

class DetailServiceAdapter(private val context: Context)
    : RecyclerView.Adapter<DetailServiceViewHolder>() {

    var datas = mutableListOf<DetailServiceData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailServiceViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_detail_service, parent, false)
        return DetailServiceViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailServiceViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount(): Int {
        return datas.size
    }

}