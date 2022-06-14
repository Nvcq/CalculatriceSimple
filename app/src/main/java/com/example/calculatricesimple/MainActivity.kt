package com.example.calculatricesimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculatrice(view: View) {
        var nb1 = nbr1.text.toString().toInt()
        var nb2 = nbr2.text.toString().toInt()
        var operation = ""
        var calcul = 0
        when (view.id) {
            R.id.plus -> operation = "+"
            R.id.minus -> operation = "-"
            R.id.diviser -> operation = "/"
            R.id.multiplier -> operation = ""
        }
        if (operation == "+") {
            calcul = nb1 + nb2
        } else if (operation == "-") {
            calcul = nb1 - nb2
        } else if (operation == "/") {
            calcul = nb1 / nb2
        } else if (operation == "") {
            calcul = nb1 * nb2
        }
        result.text = calcul.toString()
    }
}