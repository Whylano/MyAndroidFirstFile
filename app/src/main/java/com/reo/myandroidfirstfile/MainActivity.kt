package com.reo.myandroidfirstfile

import android.content.Intent
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
            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게보여줌
            // 이때 com.reo.myandroidfirstfile패키지에 새로운 AndroidActivity를 생성해주고
            // 해당하는 이미지를 크게 만들어 주는 activity_bts1.xml layout을 설정해준것을 실행되도록 만드는
            // 로직구문 입니다
            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)

        }
        //7개 image들의 이름을 다 붙이고, 각각 클릭 시, 다른 액티비티로 이동!
        var image2 = findViewById<ImageView>(R.id.btsImage2)
        var image3 = findViewById<ImageView>(R.id.btsImage3)
        var image4 = findViewById<ImageView>(R.id.btsImage4)
        var image5 = findViewById<ImageView>(R.id.btsImage5)
        var image6 = findViewById<ImageView>(R.id.btsImage6)
        var image7 = findViewById<ImageView>(R.id.btsImage7)

        image2.setOnClickListener{
            var intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener{
            var intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener{
            var intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener{
            var intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener{
            var intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener{
            var intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }

    }
}