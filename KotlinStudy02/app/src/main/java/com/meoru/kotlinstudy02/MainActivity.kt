package com.meoru.kotlinstudy02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var total:Int? =
            editText.text.toString() as Int + editText2.text.toString() as Int + editText3.text.toString() as Int + editText4.text.toString() as Int + editText5.text.toString() as Int
        button.setOnClickListener {
            textView.setText("결과 : $total")
        }
    }
}
