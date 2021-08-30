package com.example.anroid_toy_project

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.anroid_toy_project.databinding.FragmentOneBinding

class FragmentOneBinding: Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    // 자체 구현 Listener 만들기
    interface OnDataPassListener {
        fun onDataPass(data: String?)
    }
    lateinit var dataPassListener : OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("life_cycle", "F onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        val view = binding.root
        // Fragment가 인터페이스를 처음으로 그릴 때 여기가 호출된다.
        // Inflater -> View를 그려주는 애
        // Container -> 들러붙을 곳 (부모 View)
        Log.d("life_cycle", "F onCreateView")
        return inflater.inflate(R.layout.fragment_one, container, false)

//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    // Activity의 OnCreate에 했던 작업을 여기서 한다.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)
        binding.pass.setOnClickListener {
            dataPassListener.onDataPass("Good Bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onActivityCreated")

        val data = arguments?.getString("Hello")
        Log.d("data", "" + data)

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "F onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("life_cycle", "F onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("life_cycle", "F onDetach")
        super.onDetach()
    }
}