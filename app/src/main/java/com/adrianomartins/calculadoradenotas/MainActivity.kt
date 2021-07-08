package com.adrianomartins.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.IOException
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        val txtNota1: EditText = findViewById(R.id.txtNota1)
        val txtNota2: EditText = findViewById(R.id.txtNota2)
        val txtFaltas: EditText = findViewById(R.id.txtFaltas)

        btnCalcular.setOnClickListener() {

            val nota1: Int = "${txtNota1.text}".toInt()
            val nota2: Int = "${txtNota2.text}".toInt()
            val media: Int = (nota1 + nota2) / 2
            val faltas: Int = "${txtFaltas.text}".toInt()

            if (media >= 6 && faltas <= 10) {
                tvResultado.setText("Aluno aprovado!! \n Nota Final: $media \n Faltas: $faltas")
                tvResultado.setTextColor(Color.GREEN)
            } else {
                tvResultado.setText("Aluno reprovado. \n Nota Final: $media \n Faltas: $faltas")
                tvResultado.setTextColor(Color.RED)
            }

        }
    }
}