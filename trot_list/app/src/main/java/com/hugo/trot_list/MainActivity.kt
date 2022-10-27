package com.hugo.trot_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * 작업 순서
        * 1. navigation 만들기
        * 2. Fragment 만들고 네비게이션에 연결
        * 2-1. Fragment에서 버튼(이미지) 누르면 이동
        * 3. 리사이클러뷰 만들인
        */
    }
}