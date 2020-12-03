package com.example.kmongandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_serviceoption.*

class Serviceoption : Fragment() {

    private lateinit var firstunselected: View
    private lateinit var firstselected: View
    private lateinit var secondunselected: View
    private lateinit var secondselected: View
    private lateinit var thirdunselected: View
    private lateinit var thirdselected: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_serviceoption, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstunselected=view.findViewById(R.id.first_unselected)
        firstselected=view.findViewById(R.id.first_selected)
        secondunselected=view.findViewById(R.id.second_unselected)
        secondselected=view.findViewById(R.id.second_selected)
        thirdunselected= view.findViewById(R.id.third_unselected)
        thirdselected= view.findViewById(R.id.third_selected)

        first_button.setOnClickListener{
            firstunselected.visibility=View.GONE
            firstselected.visibility=View.VISIBLE
        }
        secondbutton.setOnClickListener{
            secondunselected.visibility=View.GONE
            secondselected.visibility=View.VISIBLE
        }
        thirdbutton.setOnClickListener{
            thirdunselected.visibility=View.GONE
            thirdselected.visibility=View.VISIBLE
        }

    }

}