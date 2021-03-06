package com.neppplus.fragmentpractice_20220509.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragmentpractice_20220509.R
import kotlinx.android.synthetic.main.fragment_my_second.*

class MySecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        이 프래그먼트를 들고 있는 액티비티가 완전히 만들어진 시점 ( Activity 생명주기 활용 ) > 다른 함수로 바꿔서 설명 예정
//        이벤트 처리, 데이터 보여주기 등등 "동작"
        toastBtn.setOnClickListener {
            Toast.makeText(requireContext(), "두번째 프래그먼트입니다.", Toast.LENGTH_SHORT).show()
        }
    }
}