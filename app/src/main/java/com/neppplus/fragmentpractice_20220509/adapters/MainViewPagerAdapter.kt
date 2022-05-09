package com.neppplus.fragmentpractice_20220509.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.fragmentpractice_20220509.fragments.BirthYearFragment
import com.neppplus.fragmentpractice_20220509.fragments.HelloFragment
import com.neppplus.fragmentpractice_20220509.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return NameFragment()
        } else if (position == 1) {
            return BirthYearFragment()
        } else {
            return HelloFragment()
        }
    }
}