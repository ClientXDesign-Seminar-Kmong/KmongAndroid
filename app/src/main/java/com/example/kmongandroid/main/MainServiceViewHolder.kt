package com.example.kmongandroid.main

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.kmongandroid.R

class MainServiceViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val img : ImageView = itemView.findViewById(R.id.img_main_service)
    val title : TextView = itemView.findViewById(R.id.tv_main_service_title)
    val star : TextView = itemView.findViewById(R.id.tv_main_service_star)
    val review : TextView = itemView.findViewById(R.id.tv_main_service_review)

    fun onBind(mainServiceData: MainServiceData) {
        Glide.with(itemView).load(mainServiceData.img)
                .apply(RequestOptions.bitmapTransform(RoundedCorners(16))).into(img)
        title.text = mainServiceData.title
        star.text = mainServiceData.star
        review.text = mainServiceData.review
    }
}