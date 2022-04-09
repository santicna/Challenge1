package com.example.pruebasclase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.pruebasclase.R


class FragmentOne : Fragment() {

    private lateinit var viewOne : View
    private lateinit var btnFragmentTwo: Button
    private lateinit var btnFragmentThree: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewOne = inflater.inflate(R.layout.fragment_one, container, false)
        btnFragmentTwo = viewOne.findViewById(R.id.btnFragment2)
        btnFragmentThree = viewOne.findViewById(R.id.btnFragment3)

        return viewOne
    }

    override fun onStart() {
        super.onStart()
        val navigateToFrgTwo = FragmentOneDirections.actionFrgOneToFrgTwo()
        val navigateToFrgThree = FragmentOneDirections.actionFrgOneToFrgThree()

        btnFragmentTwo.setOnClickListener {
            viewOne.findNavController().navigate(navigateToFrgTwo)
        }
        btnFragmentThree.setOnClickListener{
            viewOne.findNavController().navigate(navigateToFrgThree)
        }
    }

}