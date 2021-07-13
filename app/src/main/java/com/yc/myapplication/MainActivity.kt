package com.yc.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.yc.commonlib.extension.ycLoadImageNet

class MainActivity : AppCompatActivity() {
    val imageURl =
        "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F201508%2F25%2F20150825221030_enGxU.thumb.400_0.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1628757448&t=9e2d2d7162fea680b88caad292b2de05"
    lateinit var mImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mImageView = findViewById(R.id.ivImage)
        findViewById<Button>(R.id.btnLoadFail).setOnClickListener {
            mImageView.ycLoadImageNet("https://asdasdas")
        }
        findViewById<Button>(R.id.btnLoadSuccess).setOnClickListener {
            mImageView.ycLoadImageNet(imageURl)
        }
    }
}