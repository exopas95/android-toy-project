package com.example.anroid_toy_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import com.example.anroid_toy_project.databinding.ActivityFragmentBinding
import kotlin.math.log

class ActivityFragmentBinding : AppCompatActivity(), FragmentOneBinding.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass", "" + data)
    }

    private lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val fragmentOne: FragmentOneBinding = FragmentOneBinding()

        // Fragment에 data를 넣어주는 방법
        val bundle: Bundle = Bundle()
        bundle.putString("Hello", "Hello")
        fragmentOne.arguments = bundle

        // Fragment를 동적으로 작동하는 방법
        binding.fragmentButton.setOnClickListener {
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction: 작업의 단위(시작과 끝이 있음)
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(binding.fragmentContainer.id, fragmentOne)
            fragmentTransaction.commit()
        }

        binding.fragmentButtonTwo.setOnClickListener {
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction: 작업의 단위(시작과 끝이 있음)
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "onDestroy")
    }
}