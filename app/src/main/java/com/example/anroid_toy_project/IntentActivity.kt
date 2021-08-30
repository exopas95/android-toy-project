package com.example.anroid_toy_project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.anroid_toy_project.databinding.ActivityIntentBinding
import java.net.URI

class ActivityIntentBinding : AppCompatActivity() {
    private lateinit var binding: ActivityIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.changeActivity.setOnClickListener {
//            val intent = Intent(this@ActivityIntentBinding, ActivityIntentTwoBinding::class.java)

            // key value 방식 -> Key와 Value를 쌍으로 만들어 저장한다.
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent)

            // 명시적 인텐
//            val intent2 = Intent(this@ActivityIntentBinding, ActivityIntentTwoBinding::class.java)
//            intent2.apply {
//                this.putExtra("number3", 3)
//                this.putExtra("number4", 4)
//            }
//            startActivityForResult(intent2, 200)트

            // 암시적 인텐트
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 200) {
            Log.d("number", "" + resultCode)
            val result = data?.getIntExtra("result", 0)
            Log.d("number", "" + result)
        }

    }
}