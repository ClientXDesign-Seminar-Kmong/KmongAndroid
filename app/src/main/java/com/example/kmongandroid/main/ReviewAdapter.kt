package com.example.kmongandroid.main

import android.content.Context
import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kmongandroid.R

class ReviewAdapter (private val context:Context): RecyclerView.Adapter<ReviewHolder>(){
    var data= mutableListOf<reviewdata>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.itemlayout, parent, false)
        return ReviewHolder(view)
    }

    override fun getItemCount(): Int=data.size
    override fun onBindViewHolder(holder: ReviewHolder, position: Int) {
        holder.onBind(data[position])
    }
    }
