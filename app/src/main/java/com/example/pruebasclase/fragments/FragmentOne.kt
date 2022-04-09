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
    private lateinit var btnFragmentOne: Button
    private lateinit var btnFragmentTwo: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_one, container, false)
        btnFragmentOne = v.findViewById(R.id.btnFragment1)
        btnFragmentTwo = v.findViewById(R.id.btnFragment2)

        return v
    }

}