package com.example.kmongandroid.detail

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.kmongandroid.R

class DetailServiceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img = itemView.findViewById<ImageView>(R.id.img_detail_service)
    val title = itemView.findViewById<TextView>(R.id.tv_detail_service_title)
    val star = itemView.findViewById<TextView>(R.id.tv_detail_service_star)
    val review = itemView.findViewById<TextView>(R.id.tv_detail_service_review)
    val money = itemView.findViewById<TextView>(R.id.tv_detail_service_money)

    fun bind(detailServiceData: DetailServiceData) {
        Glide.with(itemView).load(detailServiceData.img)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(12))).into(img)
        title.text = detailServiceData.title
        star.text = detailServiceData.star
        review.text = detailServiceData.review
        money.text = detailServiceData.money
    }
}