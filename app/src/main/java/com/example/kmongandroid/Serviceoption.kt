package com.example.kmongandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_serviceoption.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Serviceoption.newInstance] factory method to
 * create an instance of this fragment.
 */
class Serviceoption : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var firstunselected: View
    private lateinit var firstselected: View
    private lateinit var secondunselected: View
    private lateinit var secondselected: View
    private lateinit var thirdunselected: View
    private lateinit var thirdselected: View

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstunselected=view.findViewById(R.id.first_unselected)
        firstselected=view.findViewById(R.id.first_selected)
        secondunselected=view.findViewById(R.id.second_unselected)
        secondselected=view.findViewById(R.id.second_selected)
        thirdunselected= view.findViewById(R.id.third_unselected)
        thirdselected= view.findViewById(R.id.third_selected)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
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

        return inflater.inflate(R.layout.fragment_serviceoption, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Serviceoption.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Serviceoption().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}