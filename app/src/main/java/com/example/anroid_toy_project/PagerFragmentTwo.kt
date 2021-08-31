package com.example.anroid_toy_project

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PagerFragmentTwo : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle", "F onCreateView")

        return inflater.inflate(R.layout.fragment_one, container, false)
    }
    companion object {
        @JvmStatic
        fun newInstance() = PagerFragmentTwo()
    }
}