package com.hugo.questionmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    /*
    * ? null 일 수 있음
    * ! null 이 무조건 아니다.
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value : String? = "a"
        val value2 : String? = null

        Log.d("valueCheck", value2!!.toString())
        // 값이 null 인 경우 에러가 뜬다. 코틀린은 null에 민감함
        // true false 이런게 아니고 걍 에러 떠버림
    }
}