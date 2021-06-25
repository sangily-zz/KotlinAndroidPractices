package com.meoru.kotlinstudy05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.meoru.kotlinstudy05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
	private lateinit var mycar:Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

		binding.benz.setOnClickListener {mycar = Benz(binding.myCar.text.toString())}
		binding.BMW.setOnClickListener {mycar = BMW(binding.myCar.text.toString())}
		binding.checkCarButton.setOnClickListener {
			if (this::mycar.isInitialized) {
				if (mycar is Benz) {
					binding.checkText.setText("차종 : Benz")
				} else {
					binding.checkText.setText("차종 : BMW")
				}
			} else { binding.checkText.setText("뚜벅뚜벅") }
		}
		binding.go.setOnClickListener {
			if (this::mycar.isInitialized) { binding.notificationText.setText("${mycar.name}의 doStart 호출됨") }
			else { binding.notificationText.setText("차를 구입해주세요.") }
		}
		binding.accelerate.setOnClickListener {
			if (this::mycar.isInitialized) { binding.notificationText.setText("${mycar.name}의 doRun 호출됨") }
			else { binding.notificationText.setText("차를 구입해주세요.") }
		}
		binding.rotate.setOnClickListener {
			if (this::mycar.isInitialized) { binding.notificationText.setText("${mycar.name}의 doTurn 호출됨") }
			else { binding.notificationText.setText("차를 구입해주세요.") }
		}
		binding.stop.setOnClickListener {
			if (this::mycar.isInitialized) { binding.notificationText.setText("${mycar.name}의 doStop 호출됨") }
			else { binding.notificationText.setText("차를 구입해주세요.") }
		}
    }
}