package com.example.kmongandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kmongandroid.main.ReviewAdapter
import com.example.kmongandroid.main.reviewdata
import kotlinx.android.synthetic.main.activity_review_with_recycler.*

class Review_with_recycler : AppCompatActivity() {
  private lateinit var reviewAdapter:ReviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_with_recycler)
        reviewAdapter= ReviewAdapter(this)
        rcv.adapter=reviewAdapter
        rcv.layoutManager=LinearLayoutManager(this)
        reviewAdapter.data= mutableListOf(
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다\n아아아아아"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다")
        )
        reviewAdapter.notifyDataSetChanged()
    }
}