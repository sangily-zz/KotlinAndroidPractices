package com.meoru.kotlinstudy02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meoru.kotlinstudy02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var first:Int? = 0
    var second:Int? = 0
    var third:Int? = 0
    var fourth:Int? = 0
    var fifth:Int? = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            val firststr:String? = binding.editText.text.toString()
            first = firststr?.toIntOrNull() ?: 0
            val secondstr:String? = binding.editText2.text.toString()
            second = secondstr?.toIntOrNull() ?: 0
            val thirdstr:String? = binding.editText3.text.toString()
            third = thirdstr?.toIntOrNull() ?: 0
            val fourthstr:String? = binding.editText4.text.toString()
            fourth = fourthstr?.toIntOrNull() ?: 0
            val fifthstr:String? = binding.editText5.text.toString()
            fifth = fifthstr?.toIntOrNull() ?: 0
            val total = first!! + second!! + third!! + fourth!! + fifth!!
            binding.textView.setText("결과 : ${total}")
        }
    }
}
