package com.example.kmongandroid.main

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.kmongandroid.R

class HomeCardViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    val img : ImageView = itemView.findViewById(R.id.img_home_card)

    fun onBind(homeCardData: HomeCardData){
        Glide.with(itemView).load(homeCardData.img)
                .apply(RequestOptions.bitmapTransform(RoundedCorners(16))).into(img)
    }
}