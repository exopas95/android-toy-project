package com.example.anroid_toy_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.anroid_toy_project.databinding.ActivityTabPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class ActivityTabPagerBinding : AppCompatActivity() {
    private lateinit var binding: ActivityTabPagerBinding
    private lateinit var tabPagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabPagerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("ONE"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("TWO"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("THREE"))

//        val pagerAdapter = PagerAdapter(, 3)
    }


}

class PagerAdapter(
    fragment: Fragment
): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> PagerFragmentOne()
            1 -> PagerFragmentTwo()
            2 -> PagerFragmentThree()
            else -> PagerFragmentOne()
        }
    }
}