package ru.nsu.mycalendar

import android.app.Activity
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Authorization(private val activity: Activity) {
    fun start() {
        val login: EditText = activity.findViewById(R.id.loginForm)
        val password: EditText = activity.findViewById(R.id.passwordForm)
        val loginButton: Button = activity.findViewById(R.id.button)

        loginButton.setOnClickListener {
            if (login.text.isEmpty() || password.text.isEmpty()) {
                println("Login unsuccessful")
            } else {
                println("Login successful")
            }
        }
    }
}