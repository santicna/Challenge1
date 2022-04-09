package com.example.pruebasclase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.pruebasclase.R


class FragmentThree : Fragment() {
    private lateinit var viewThree : View
    private lateinit var btnFragmentOne: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewThree = inflater.inflate(R.layout.fragment_three, container, false)
        btnFragmentOne = viewThree.findViewById(R.id.btnFragment1)

        return viewThree
    }

    override fun onStart() {
        super.onStart()
        val navigateToFrgOne = FragmentThreeDirections.actionFrgThreeToFrgOne()

        btnFragmentOne.setOnClickListener {
            viewThree.findNavController().navigate(navigateToFrgOne)
        }
    }
}