package com.example.ejercicio1

import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


// Declara la variable en la que se almacena una referencia al elemento TextView
        val texto = findViewById<TextView>(R.id.textoVariable)
        val textoEditado : EditText

        // Emplea un setter para cambiar la propiedad del texto.
        texto.setText("Este texto ha cambiado!")

        texto.setTextColor( getResources().getColor(R.color.white))


    }
}



