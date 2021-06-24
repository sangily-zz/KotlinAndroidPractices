package com.meoru.kotlinstudy03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meoru.kotlinstudy03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val add:(Int, Int) -> Int = {a, b -> a + b}
        val subtract:(Int, Int) -> Int = {a, b -> a - b}
        val multiply:(Int, Int) -> Int = {a, b -> a * b}
        val devide:(Int, Int) -> Int = {a, b -> if (b!=0) {a / b} else {0}}

        fun getOperation(oper:(Int, Int) -> Int):Int {
            var a = binding.input1.text.toString().toIntOrNull() ?: 0
            var b = binding.input2.text.toString().toIntOrNull() ?: 0

            return oper(a, b)
        }

        binding.add.setOnClickListener {binding.textView.setText("결과 : ${getOperation(add)}")}
        binding.subtract.setOnClickListener {binding.textView.setText("결과 : ${getOperation(subtract)}")}
        binding.multiply.setOnClickListener {binding.textView.setText("결과 : ${getOperation(multiply)}")}
        binding.devide.setOnClickListener {binding.textView.setText("결과 : ${getOperation(devide)}")}
    }

}