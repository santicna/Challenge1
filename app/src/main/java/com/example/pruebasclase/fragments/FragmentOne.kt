package com.example.pruebasclase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.pruebasclase.R


class FragmentOne : Fragment() {

    private lateinit var viewOne : View
    private lateinit var btnFragmentTwo: Button
    private lateinit var btnFragmentThree: Button
    private var mBackPressed : Long = 0
    private lateinit var exitToast : Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        exitToast = Toast.makeText(
            context,
            getString(R.string.exit_confirmation_toast),
            Toast.LENGTH_SHORT
        )
        requireActivity().onBackPressedDispatcher.addCallback(this, onBackPressed)
    }

    private var onBackPressed = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            if (mBackPressed + 2000 > System.currentTimeMillis()) {
                activity?.finish()
                exitToast.cancel()
            } else {
                exitToast.show()
            }
            mBackPressed = System.currentTimeMillis()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
            exitToast.cancel()
            viewOne.findNavController().navigate(navigateToFrgTwo)
        }
        btnFragmentThree.setOnClickListener{
            exitToast.cancel()
            viewOne.findNavController().navigate(navigateToFrgThree)
        }
    }


}