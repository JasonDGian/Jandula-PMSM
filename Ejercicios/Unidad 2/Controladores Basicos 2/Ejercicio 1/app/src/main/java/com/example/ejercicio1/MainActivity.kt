package com.example.ejercicio1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner
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

        /* ------------------ ADAPTADOR -----------------*/

        //Iterable con elementos para spinner.
        val diasSemanales = arrayOf("Lunes", "Martes", "Miercoles", "Jueves","Viernes", "Sabado", "Domingo")

        // Adaptador

        // android.R.layout.simple_list_item_activated_1 -> Indica que se rellenará con un simple textview.
        // Variante de android.R.layout.simple_list_item_1 (no tiene "activated")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, diasSemanales)

        /*---------------- SPINNER ----------------*/
        // Este elemento a diferencia del AutoCompleteTextView no permite elegir algo que no está presente en la lista definida.
        // Limita las elecciones a lo que definimos nosotros los programadores y no permite flexibilidad en ese sentido.

        //localizamos el elemento.
        val spinnerDias = findViewById<Spinner>(R.id.spinner_dias)

        // alimentamos el adaptador del spinner concretando tipo e iterable.
        spinnerDias.adapter = adaptador

        /*---------------- AUTO COMPLETE TEXT VIEW ----------------*/
        // Ese elemento sugiere el autocompletado de las palabras que se comienzan a teclear. Es util para por ejemplo elegir regiones
        // en un formulario o completar nombre de empresas conocidas etc.. Valores de un formulario contenidos en una lista que deseamos
        // sugerir al usuario que está rellenando el formulario de modo que facilitamos la tarea y ademas evitamos errores tipograficos.

        // localizamos el elemento.
        val autocompleteDias = findViewById<AutoCompleteTextView>(R.id.actv_dias)

        autocompleteDias.setAdapter(adaptador)

    }
}