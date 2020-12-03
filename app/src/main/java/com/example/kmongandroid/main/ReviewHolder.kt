package com.example.kmongandroid.main

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kmongandroid.R

class ReviewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
private val id: TextView = itemView.findViewById(R.id.id)
    private val date: TextView = itemView.findViewById(R.id.date)
    private val service: TextView = itemView.findViewById(R.id.service)
    private val review: TextView = itemView.findViewById(R.id.review)

    fun onBind(data: reviewdata){
        id.text=data.id
        date.text=data.date
        service.text=data.service
        review.text=data.review
    }
}