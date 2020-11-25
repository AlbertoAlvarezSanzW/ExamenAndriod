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
        setContentView(R.layout.segundaactividad)

        // tenemos que recibirlo con una constante que es val
        val number = 0
        val variable = intent.getIntExtra(variableCompartida,number)
        val texto = findViewById<TextView>(R.id.textView2)
        // esto es asi, xq es asi y .
        variable?.let {
            texto.text = variable.toString()
        }

        val textView = findViewById<TextView>(R.id.textView2)
        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)





    }
}


