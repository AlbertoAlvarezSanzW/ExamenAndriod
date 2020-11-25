package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

/*
Intruccione: Se debe de crear un nuevo proyecto en andriod utilizando kotlon
el proyecto se compone de una primera actividad con un gran edittext y un boton desactivado
sigue en la 2 hoja
 */

class MainActivity : AppCompatActivity() {
    companion object {
        const val EJ1 = "VARIABLE1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1 = findViewById<EditText>(R.id.editT)
        val boton1 = findViewById<Button>(R.id.button)
        boton1.setEnabled(false)

        edit1.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s:CharSequence, start:Int, before:Int, count:Int) {
                var w:Int =0
                for (i in s) {
                    if (s.isBlank())
                        w++
                }
                if (w==4) {
                    boton1.setEnabled(true)
                } else {
                    boton1.setEnabled(false)
                }
            }
            override fun beforeTextChanged(s:CharSequence, start:Int, count:Int,after:Int) {
            }
            override fun afterTextChanged(s: Editable) {
            }
        })
        boton1.setOnClickListener {
            val intent =  Intent ( this, SecondActivity :: class .java)
            intent.putExtra(EJ1,1)
            startActivity (intent)
        }

    }
}