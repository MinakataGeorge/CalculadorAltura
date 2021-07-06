package com.example.calculadoraltura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Primero hacemos las variables
    lateinit var etAltura:EditText
    lateinit var btnCalcular:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etAltura = findViewById(R.id.etAltura)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            Toast.makeText(this,etAltura.text,Toast.LENGTH_LONG).show()
        }
    }
}