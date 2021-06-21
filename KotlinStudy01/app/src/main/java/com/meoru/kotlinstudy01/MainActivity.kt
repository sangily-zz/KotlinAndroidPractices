package com.meoru.kotlinstudy01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meoru.kotlinstudy01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.setText("입력한 값 : ${binding.editTextTextPersonName.text.toString()}")
        }
        binding.button2.setOnClickListener {
            binding.textView.setText("입력한 값 : " + binding.editTextTextPersonName2.text.toString())
        }
    }
}