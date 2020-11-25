package com.example.examen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity()  {

    companion object{const val variableCompartida="variableEstatica"}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        // tenemos que recibirlo con una constante que es val
        val number = 0
        val variable = intent.getIntExtra(variableCompartida,number)









    }
}


