package com.example.kmongandroid

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        appbar.addOnOffsetChangedListener(
            AppBarLayout.OnOffsetChangedListener { _, verticalOffset ->
            if ((collapsingToolbar.height + verticalOffset) < (2 * ViewCompat.getMinimumHeight(collapsingToolbar))) {
                cl_detail.setBackgroundColor(Color.WHITE)
                img_detail_back.setImageResource(R.drawable.ic_arrow_left_black)
                img_detail_share.setImageResource(R.drawable.ic_share_black)
            } else {
                cl_detail.setBackgroundColor(Color.TRANSPARENT)
                img_detail_back.setImageResource(R.drawable.ic_arrow_left)
                img_detail_share.setImageResource(R.drawable.ic_share)
            }
        })
    }
}