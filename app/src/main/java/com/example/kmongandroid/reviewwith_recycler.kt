package com.example.kmongandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kmongandroid.main.ReviewAdapter
import com.example.kmongandroid.main.reviewdata
import kotlinx.android.synthetic.main.activity_review_with_recycler.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [reviewwith_recycler.newInstance] factory method to
 * create an instance of this fragment.
 */
class reviewwith_recycler : Fragment() {
    private lateinit var reviewAdapter: ReviewAdapter
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        reviewAdapter= ReviewAdapter(context!!)
        rcv.adapter=reviewAdapter
        rcv.layoutManager= LinearLayoutManager(context!!)
        reviewAdapter.data= mutableListOf(
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다\n아아아아아"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다"),
            reviewdata("abc01***", "2020.11.11", "심볼/엠블럼형 로고", "친절하게 해주셨어요, 감사합니다")
        )
        reviewAdapter.notifyDataSetChanged()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reviewwith_recycler, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment reviewwith_recycler.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            reviewwith_recycler().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}