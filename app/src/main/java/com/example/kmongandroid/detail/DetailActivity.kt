package com.example.kmongandroid.detail

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.kmongandroid.R
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.item_detail_service.*

class DetailActivity : AppCompatActivity() {

    private lateinit var detailServiceAdapter: DetailServiceAdapter
    var datas = mutableListOf<DetailServiceData>()

    @SuppressLint("UseCompatLoadingForDrawables")
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

        img_detail_back.setOnClickListener {
            finish()
        }

        // 탭레이아웃
//        val tabLayout = view?.findViewById(R.id.detail_tablayout) as TabLayout
//        val viewPager = view?.findViewById(R.id.detail_vp) as ViewPager
//        val tabAdapter = DetailTabAdapter(supportFragmentManager)
//        detail_vp.adapter = tabAdapter
//        detail_vp.offscreenPageLimit = 2
//        tabAdapter.notifyDataSetChanged()

        //detail_tablayout.setupWithViewPager(detail_vp)
//        tabLayout.getTabAt(0)!!.text = "서비스 설명"
//        tabLayout.getTabAt(1)!!.text = "서비스 옵션"
//        tabLayout.getTabAt(2)!!.text = "전문가 정보"
//        tabLayout.getTabAt(3)!!.text = "리뷰"

        // 리사이클러뷰
        detailServiceAdapter = DetailServiceAdapter(this)

        rv_detail_service.adapter = detailServiceAdapter
        rv_detail_service.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        detailServiceAdapter.datas = mutableListOf(
            DetailServiceData("https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593__340.jpg", "타이틀", "5.0", "리뷰 100건", "60,000원 ~"),
            DetailServiceData("https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593__340.jpg", "타이틀", "5.0", "리뷰 100건", "60,000원 ~"),
            DetailServiceData("https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593__340.jpg", "타이틀", "5.0", "리뷰 100건", "60,000원 ~"),
            DetailServiceData("https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593__340.jpg", "타이틀", "5.0", "리뷰 100건", "60,000원 ~"),
            DetailServiceData("https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593__340.jpg", "타이틀", "5.0", "리뷰 100건", "60,000원 ~")
        )

        detailServiceAdapter.notifyDataSetChanged()

    }
}