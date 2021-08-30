package com.example.anroid_toy_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.anroid_toy_project.databinding.ActivityListenerBinding

class ActivityListenerBinding : AppCompatActivity() {
    private lateinit var binding: ActivityListenerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListenerBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        view.setOnClickListener {
            Log.d("click", "CLICK!!!")
        }
        //binding.listenerText.setText("안녕하세요")
    }
}