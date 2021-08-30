package com.example.anroid_toy_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.anroid_toy_project.databinding.ActivityIntentTwoBinding

class ActivityIntentTwoBinding : AppCompatActivity() {
    private lateinit var binding: ActivityIntentTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntentTwoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.intentResult.setOnClickListener {
//            val number1 = intent.getIntExtra("number1", 0)
//            val number2 = intent.getIntExtra("number2", 0)
            val number3 = intent.getIntExtra("number3", 0)
            val number4 = intent.getIntExtra("number4", 0)

//            Log.d("number", "" + number1)
//            Log.d("number", "" + number2)
            Log.d("number", "" + number3)
            Log.d("number", "" + number4)

            val result = number3 + number4
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)
            setResult(RESULT_OK, resultIntent)
            this.finish()   // Activity 종료
        }

    }
}