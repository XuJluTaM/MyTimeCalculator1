package com.example.mytimecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mytimecalculator.R

class MainActivity : AppCompatActivity() {

    private lateinit var inputTime1Hours: EditText
    private lateinit var inputTime1Minutes: EditText
    private lateinit var inputTime1Seconds: EditText

    private lateinit var inputTime2Hours: EditText
    private lateinit var inputTime2Minutes: EditText
    private lateinit var inputTime2Seconds: EditText

    private lateinit var addBtn: Button
    private lateinit var subtractBtn: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputTime1Hours = findViewById(R.id.inputTime1Hours)
        inputTime1Minutes = findViewById(R.id.inputTime1Minutes)
        inputTime1Seconds = findViewById(R.id.inputTime1Seconds)

        inputTime2Hours = findViewById(R.id.inputTime2Hours)
        inputTime2Minutes = findViewById(R.id.inputTime2Minutes)
        inputTime2Seconds = findViewById(R.id.inputTime2Seconds)

        addBtn = findViewById(R.id.addBtn)
        subtractBtn = findViewById(R.id.subtractBtn)
        resultTextView = findViewById(R.id.resultTextView)

        addBtn.setOnClickListener {
            addTimes()
        }

        subtractBtn.setOnClickListener {
            subtractTimes()
        }
    }

    private fun addTimes() {
        val time1Hours = inputTime1Hours.text.toString().toIntOrNull() ?: 0
        val time1Minutes = inputTime1Minutes.text.toString().toIntOrNull() ?: 0
        val time1Seconds = inputTime1Seconds.text.toString().toIntOrNull() ?: 0

        val time2Hours = inputTime2Hours.text.toString().toIntOrNull() ?: 0
        val time2Minutes = inputTime2Minutes.text.toString().toIntOrNull() ?: 0
        val time2Seconds = inputTime2Seconds.text.toString().toIntOrNull() ?: 0

        val resultHours = time1Hours + time2Hours
        val resultMinutes = time1Minutes + time2Minutes
        val resultSeconds = time1Seconds + time2Seconds

        val finalResult = "$resultHours h $resultMinutes m $resultSeconds s"
        resultTextView.text = finalResult
    }

    private fun subtractTimes() {
        val time1Hours = inputTime1Hours.text.toString().toIntOrNull() ?: 0
        val time1Minutes = inputTime1Minutes.text.toString().toIntOrNull() ?: 0
        val time1Seconds = inputTime1Seconds.text.toString().toIntOrNull() ?: 0

        val time2Hours = inputTime2Hours.text.toString().toIntOrNull() ?: 0
        val time2Minutes = inputTime2Minutes.text.toString().toIntOrNull() ?: 0
        val time2Seconds = inputTime2Seconds.text.toString().toIntOrNull() ?: 0

        val resultHours = time1Hours - time2Hours
        val resultMinutes = time1Minutes - time2Minutes
        val resultSeconds = time1Seconds - time2Seconds

        val finalResult = "$resultHours h $resultMinutes m $resultSeconds s"
        resultTextView.text = finalResult
    }
}
