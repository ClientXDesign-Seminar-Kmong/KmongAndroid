package com.example.kmongandroid.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.kmongandroid.R
import com.example.kmongandroid.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var homeCardAdapter: HomeCardAdapter
    private lateinit var mainServiceAdapter: MainServiceAdapter
    private lateinit var mainServiceAdapter2: MainServiceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // HomeCardRecyclerView
        homeCardAdapter = HomeCardAdapter(this)

        rv_home_card.adapter = homeCardAdapter
        rv_home_card.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        homeCardAdapter.data = mutableListOf(
            HomeCardData("https://cdn.pixabay.com/photo/2017/10/10/21/47/laptop-2838921_1280.jpg"),
            HomeCardData("https://cdn.pixabay.com/photo/2017/05/12/08/29/coffee-2306471_1280.jpg"),
            HomeCardData("https://cdn.pixabay.com/photo/2014/05/02/21/49/laptop-336373_1280.jpg"),
            HomeCardData("https://cdn.pixabay.com/photo/2015/05/15/14/47/computer-768696_1280.jpg")
        )

        // circular scroll
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_home_card)
        (rv_home_card.layoutManager as LinearLayoutManager)
                .scrollToPosition((Int.MAX_VALUE/2) - (Int.MAX_VALUE/2)%homeCardAdapter.data.size)

        homeCardAdapter.notifyDataSetChanged()

        // DesignServiceRecyclerview
        mainServiceAdapter = MainServiceAdapter(this)

        rv_design_service.adapter = mainServiceAdapter
        rv_design_service.layoutManager = LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false)

        mainServiceAdapter.data = mutableListOf(
                MainServiceData("https://cdn.pixabay.com/photo/2016/11/29/09/32/concept-1868728_1280.jpg", "타이틀", "5.0", "100개의 평가"),
                MainServiceData("https://cdn.pixabay.com/photo/2016/11/29/09/32/concept-1868728_1280.jpg", "타이틀", "5.0", "100개의 평가")
        )

        mainServiceAdapter.notifyDataSetChanged()

        mainServiceAdapter.setItemClickListener(object: MainServiceAdapter.ItemClickListener {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(intent)
            }

        })

        // ProgrammingServiceRecyclerview
        mainServiceAdapter2 = MainServiceAdapter(this)

        rv_programming_service.adapter = mainServiceAdapter2
        rv_programming_service.layoutManager = LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false)

        mainServiceAdapter2.data = mutableListOf(
                MainServiceData("https://cdn.pixabay.com/photo/2016/11/29/09/32/concept-1868728_1280.jpg", "타이틀22", "5.0", "100개의 평가"),
                MainServiceData("https://cdn.pixabay.com/photo/2016/11/29/09/32/concept-1868728_1280.jpg", "타이틀22", "5.0", "100개의 평가")
        )

        mainServiceAdapter2.notifyDataSetChanged()

        mainServiceAdapter2.setItemClickListener(object: MainServiceAdapter.ItemClickListener {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(intent)
            }

        })
    }
}