package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitBtn.setOnClickListener { checkAnswers() }
    }

    private fun checkAnswers() {
        var wrong = 0
        if (binding.answer1.text.toString().toUpperCase() != "T") wrong++
        if (binding.answer2.text.toString().toUpperCase() != "F") wrong++
        if (binding.answer3.text.toString().toUpperCase() != "F") wrong++
        if (binding.answer4.text.toString().toUpperCase() != "F") wrong++

        if (wrong == 0) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, getString(R.string.num_of_4_wrong, wrong), Toast.LENGTH_SHORT).show()
        }
    }
}