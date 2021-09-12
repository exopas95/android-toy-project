package com.example.anroid_toy_project

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.anroid_toy_project.databinding.ActivitySharedPreferenceBinding
import com.example.anroid_toy_project.databinding.ActivityTabPagerBinding

class ActivitySharedPreferenceBinding : AppCompatActivity() {

    private lateinit var binding: ActivitySharedPreferenceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySharedPreferenceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // SharedPreference
        // MODE_PRIVATE: 생성한 Application에서만 사용 가능
        // MODE_WORLD_READABLE & WRITABLE: 다른 어플리케이션에서 사용 가능
        // MODE_MULTI_PROCESS: 이미 호출되어 사용중인지 체크
        // MODE_APPEND: 기존 preference에 신규로 추가
        val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString("hello", "안녕하세요")
        editor.commit()
    }


}