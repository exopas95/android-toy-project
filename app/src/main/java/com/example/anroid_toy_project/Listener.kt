package com.example.anroid_toy_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.anroid_toy_project.databinding.ActivityListenerBinding


//class Listener : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_listener)
//
//        val textView : TextView = findViewById(R.id.hello)
//        textView.setOnClickListener {
//            Log.d("click", "Click!!!")
//        }
//    }
//}

// View Binding 써서 event click 호출하는 방법
class ActivityListenerBinding : AppCompatActivity() {
    private lateinit var binding: ActivityListenerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListenerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.hello.setOnClickListener {
            Log.d("click", "Click!!")
        }
    }
}