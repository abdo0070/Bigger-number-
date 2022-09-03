package com.abdalla_mmdouh.biggernumber

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.asJavaRandom


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assignNewValue()
        btnLeft.setOnClickListener{
            compareNumbers(true)
        }
        btnRight.setOnClickListener {
            compareNumbers(false)
    }
}
    private fun compareNumbers(isLeft : Boolean){
        // Compare the Two number
        // reassign the value of two number
        val left = btnLeft.text.toString().toInt()
        val right = btnRight.text.toString().toInt()
        // ternary statement
        val isCorrect = if (isLeft) left > right else left<right
        if (isCorrect){
            // the background color Green
            clRoot.setBackgroundColor(Color.GREEN)
        }
        else{
            // the background color Red
            clRoot.setBackgroundColor(Color.RED)
        }
        assignNewValue()
    }
    private fun assignNewValue() {
        var rand = Random.nextInt(10)
        var left = rand
        var right = rand
        while (right == left){
            // change the value of right
            var rand = Random.nextInt(10)
            right = rand
        }
        // Update the Value of Text Button
        btnRight.text = right.toString()
        btnLeft.text = left.toString()
    }
}