package com.example.kmongandroid.detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kmongandroid.*

class DetailTabAdapter(fm:FragmentManager)
    : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 4

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> Explanation()
            1 -> Serviceoption()
            2 -> expertinfo()
            else -> reviewwith_recycler()
        }
    }

}