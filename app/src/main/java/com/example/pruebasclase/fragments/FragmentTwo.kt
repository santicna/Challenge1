package com.example.pruebasclase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.pruebasclase.R

class FragmentTwo : Fragment() {

    private lateinit var viewTwo : View
    private lateinit var btnFragmentOne: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewTwo = inflater.inflate(R.layout.fragment_two, container, false)
        btnFragmentOne = viewTwo.findViewById(R.id.btnFragment1)

        return viewTwo
    }

    override fun onStart() {
        super.onStart()
        val navigateToFrgOne = FragmentTwoDirections.actionFrgTwoToFrgOne()

        btnFragmentOne.setOnClickListener {
            viewTwo.findNavController().navigate(navigateToFrgOne)
        }
    }
}