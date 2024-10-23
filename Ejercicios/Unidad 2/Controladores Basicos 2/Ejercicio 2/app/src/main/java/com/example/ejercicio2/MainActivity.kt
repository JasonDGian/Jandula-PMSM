package com.example.ejercicio2

import android.graphics.Color
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
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

        val textoEncima = findViewById<TextView>(R.id.textoArriba)
        textoEncima.setTextColor(Color.RED)
        textoEncima.textSize = 20f
        


        val grupoRadio = findViewById<RadioGroup>(R.id.rg_grupoRadio)

        grupoRadio.setOnCheckedChangeListener {
            group, checkedId -> val selectedRadioButton = findViewById<RadioButton>(checkedId)

            textoEncima.setText(selectedRadioButton.text)
        }


    }
}