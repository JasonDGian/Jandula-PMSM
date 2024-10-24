package com.example.ejercicio4

import android.os.Bundle
import android.util.Log
import android.view.DragEvent
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
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

        // Almacena la vista en una variable.
        val texto1 = findViewById<TextView>(R.id.tvTexto1)

        // "Setea el escuchador
        texto1.setOnDragListener { thisView, dragEvent ->
            when(dragEvent.action) {

                DragEvent.ACTION_DRAG_STARTED -> {
                    Log.d("Funcion drag", "DRAG INICIADO")
                    true
                }

                DragEvent.ACTION_DRAG_ENTERED ->{
                    Log.d("Funcion drag", "DRAG ENTRADO")
                    true
                }
                DragEvent.ACTION_DRAG_EXITED ->{
                    Log.d("Funcion drag", "DRAG SALIDA")
                    true
                }
                else -> false // Return false for unhandled actions

            }




        }


        // Busca la vista.
        val texto2 = findViewById<TextView>(R.id.tvTexto2)

        // Setea el "escuchador"
        texto2.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                texto2.text = "Tiene focus."  // Correctly setting the text
                Log.d("FUNCION FOCUS", "ESTA EN FOCO")
            } else {
                texto2.text = "No tiene focus" // Correctly setting the text
                Log.d("FUNCION FOCUS", "NO ESTA EN FOCO")
            }
        }



        // Busca la vista.
        val texto3 = findViewById<TextView>( R.id.tvTexto3 )

        texto3.setOnKeyListener{ view , keyCode, event ->

            if ( event.action == KeyEvent.ACTION_UP ){  // Esto no hace lo que yo creia. Ver mejor.
                Log.d("Funcion onKey", "ACTION UP")
                    true
            }else {
                false
            }


        }

        val texto4 = findViewById<TextView>(R.id.tvTexto4)
        val yl = ContextCompat.getColor(this, R.color.yellow)
        val bl = ContextCompat.getColor(this, R.color.blue)

        texto4.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_UP -> {
                    Log.d("TouchListener", "Action up")
                    texto4.setText("Touched Up")
                    texto4.setBackgroundColor(bl)
                    texto4.setTextColor(yl)
                    true // Indicates the event was handled
                }

                MotionEvent.ACTION_DOWN -> {
                    Log.d("TouchListener", "Action Down") // Use lowercase 'd'
                    texto4.setText("Touched Down")
                    texto4.setBackgroundColor(yl)
                    texto4.setTextColor(bl)
                    true // Indicates the event was handled
                }

                else -> false // Allow other events to be handled
            }
        }








    }

}