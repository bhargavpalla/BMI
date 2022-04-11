package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint)
    }

    fun funcal(view: View){
        var wt: Double
        var ht: Double
        var bmi: Float
        wt = weight?.text.toString().toDouble()
        ht = height?.text.toString().toDouble()
        bmi = ((wt*0.45)/((ht*0.025)*(ht*0.025))).toFloat()
        text_view_bmi.text = bmi.toString()
        if(bmi<18.5){
            img_bmi.setImageResource(R.drawable.underweight)
        }
        else if(bmi>18.5 && bmi<24.9){
            img_bmi.setImageResource(R.drawable.healthy)
        }else if(bmi>24.9 && bmi<29.9){
            img_bmi.setImageResource(R.drawable.overweight)
        }else{
            img_bmi.setImageResource(R.drawable.obesity)
        }

    }
}