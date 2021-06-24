package com.meoru.kotlinstudy04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.meoru.kotlinstudy04.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boy = Student("철수")
        val girl = Student("영희")
        val dummy = Student(" ")
        var flag:Int = 0

        boy.set("개발자", 7, 4, 3, 6, 7)
        girl.set("사무직", 2, 7, 5, 7, 7)

        binding.boyImg.setOnClickListener {
            flag = 1
            showStat(boy)
        }
        binding.girlImg.setOnClickListener {
            flag = 2
            showStat(girl)
        }
        binding.choose.setOnClickListener {
            showStat(dummy)
            when (flag) {
                0 -> Toast.makeText(applicationContext, "캐릭터를 선택해주세요.", Toast.LENGTH_LONG).show()
                1 -> Toast.makeText(applicationContext, "개발자를 선택하셨습니다.", Toast.LENGTH_LONG).show()
                2 -> Toast.makeText(applicationContext, "사무직을 선택하셨습니다.", Toast.LENGTH_LONG).show()
            }
            flag = 0
        }
    }

    fun fileUpStat(stat:Int, text:TextView) { for (i in 0 until stat) text.append("■") }

    fun showStat(gender:Student) {
        binding.aboveMsg.setText("선택된 캐릭터 : ${gender.job}")
        binding.name.setText(gender.name ?: " ")
        binding.job.setText(gender.job ?: " ")
        binding.strength.setText("")
        fileUpStat(gender.strength, binding.strength)
        binding.agility.setText("")
        fileUpStat(gender.agility, binding.agility)
        binding.health.setText("")
        fileUpStat(gender.health, binding.health)
        binding.intelligence.setText("")
        fileUpStat(gender.intelligence, binding.intelligence)
        binding.luck.setText("")
        fileUpStat(gender.luck, binding.luck)
    }
}