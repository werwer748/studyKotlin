package com.hugo.diet_memo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SplashActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        auth = Firebase.auth

        val EndSplash = Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)

        try {
            Log.d("SPLASH", auth.currentUser!!.uid)
            Toast.makeText(this, "로그인이 되어있습니다.", Toast.LENGTH_SHORT).show()
            EndSplash
        } catch (e: Exception) {
            Log.d("SPLASH", "회원가입 시켜줘야함")
            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(this, "비회원 로그인 성공", Toast.LENGTH_SHORT).show()
                        EndSplash
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(this, "비회원 로그인 실패", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}