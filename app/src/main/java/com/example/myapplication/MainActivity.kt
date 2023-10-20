package com.example.myapplication

import android.widget.Toast
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.Button


public class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show()
        // La actividad está creada.
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // lógica para el inicio de sesión
        }
    }



}