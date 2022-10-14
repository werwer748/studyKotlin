package com.hugo.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = "여기는 value입니다!"
        val value2 = "여기는 value2입니다!"
        /*
        * value = "value 아님!"
        * var 은 값을 재정의 할 수 있다 (let, var)
        *
        * value2 = "123123123"
        * val 은 값을 재정의 할 수 없다 (const)
        * */

        // 로그 종류 5가지
        Log.e("MainActivity", value) // 오류
        Log.w("MainActivity", value) // 경고
        Log.i("MainActivity", value) // 정보
        Log.d("MainActivity", value) // 디버그
        Log.v("MainActivity", value) //상세
    }
}