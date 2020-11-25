package com.example.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

/*
Intruccione: Se debe de crear un nuevo proyecto en andriod utilizando kotlon
el proyecto se compone de una primera actividad con un gran edittext y un boton desactivado
sigue en la 2 hoja
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // creamos el edit text como constante
        val EditText = findViewById<EditText>(R.id.Edit2)

    }
}