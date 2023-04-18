package com.example.basiccalculater

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {


    private val ACTION=""
    private val ADDITION = " + "
    private val SUBTRACTION = " − "
    private val MULTIPLICATION = " × "
    private val DIVISION = " ÷ "

    private var val1=0
    private var val2=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findView()

//        onInstantOperationButtonClick(ACTION)
    }
    fun getButtonText(v:View) : String{
        val b = v as Button
        val t = findViewById<TextView>(R.id.calculate)
        val buttonText = b.text.toString()
        println("buttonText $buttonText")

        t.setText(buttonText)

        println("ttextttt ${t.text.toString()}")
        return buttonText
    }

    fun findView(){
        val button_clear: Button = findViewById(R.id.button_clear)
        val button_convert: Button = findViewById(R.id.button_convert)
        val button_percent: Button = findViewById(R.id.button_percent)
        val button_division: Button = findViewById(R.id.button_division)
        val button_one: Button = findViewById(R.id.button_one)
        val button_two: Button = findViewById(R.id.button_two)
        val button_three: Button = findViewById(R.id.button_three)
        val button_four: Button = findViewById(R.id.button_four)
        val button_five: Button = findViewById(R.id.button_five)
        val button_six: Button = findViewById(R.id.button_six)
        val button_seven: Button = findViewById(R.id.button_seven)
        val button_eight: Button = findViewById(R.id.button_eight)
        val button_nine: Button = findViewById(R.id.button_nine)
        val button_zero: Button = findViewById(R.id.button_zero)
        val button_equal: Button = findViewById(R.id.button_equal)
        val button_sum: Button = findViewById(R.id.button_summation)
        val button_sub: Button = findViewById(R.id.button_subtraction)
        val button_multi: Button = findViewById(R.id.button_multiplication)
        val button_dot: Button = findViewById(R.id.button_dot)

    }


//    private fun onInstantOperationButtonClick(operation: String) {
//        when(operation){
//            ADDITION -> val1 += val2
//            SUBTRACTION -> val1 -= val2
//            MULTIPLICATION -> val1 *=val2
//            DIVISION -> val1 /=val2
//        }
//    }

//    private fun onButtonSetOnClickListener(button: Button):TextView{
//        button.setOnClickListener(View.OnClickListener {
//
//        })
//    }







}