package ru.nsu.mycalendar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        val loginText: TextView = findViewById(R.id.loginText)
//        val passwordText: TextView = findViewById(R.id.passwordText)
        val login: EditText = findViewById(R.id.loginForm)
        val password: EditText = findViewById(R.id.passwordForm)
        val loginButton: Button = findViewById(R.id.button)
        loginButton.setOnClickListener {
            if (login.text.isEmpty() || password.text.isEmpty()) {
                println("login unsuccessful")
            } else {
                println("login successful")
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}