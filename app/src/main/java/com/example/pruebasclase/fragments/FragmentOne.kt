package com.example.pruebasclase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.pruebasclase.R


class FragmentOne : Fragment() {

    private lateinit var v : View
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
        v = inflater.inflate(R.layout.fragment_one, container, false)
        btnFragmentTwo = v.findViewById(R.id.btnFragment2)
        btnFragmentThree = v.findViewById(R.id.btnFragment3)

        return v
    }

}