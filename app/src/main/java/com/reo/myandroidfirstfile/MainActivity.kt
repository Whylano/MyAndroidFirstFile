package com.reo.myandroidfirstfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //화면을 보여주는 코드
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되어있다는 것을 알아야 합니다! (프로그램이)
        val image1=findViewById<ImageView>(R.id.btsImage1);
        image1.setOnClickListener {
            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
        }
        // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게보여줌

    }
}