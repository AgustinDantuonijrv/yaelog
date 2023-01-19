package com.example.yaelog.dashboard

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.yaelog.databinding.ActivityDashboardBinding
import com.example.yaelog.ui.login.LoginFormStatePeroJava


class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private var numResult: Int = 0
    private val numResult2: Int = 10

    lateinit var state: LoginFormStatePeroJava

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?)  {
        super.onCreate(savedInstanceState, persistentState)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // numResult = funcion2(5, 10)  // se puede asignar un valor a la variable numResult asi?????
        numResult = nombre_de_la_funcion(5, numResult2)
        Toast.makeText(this, "EL resultado es: $numResult",Toast.LENGTH_SHORT)
        funcion2(5, 10)

        state.usernameError = 10

        if (state.usernameError > 5) {
            numResult = nombre_de_la_funcion(10, 8)
        } else {
            state.usernameError = state.usernameError + 1
        }

        // for
        for (i in state.usernameError..4) {
            state.usernameError = state.usernameError + i
        }
    }
    // Parametros: son los valores que le paso a la funcion
    // las funciones o hacen algo y devuelven nada osea VOID o hacen algo y devuelven un resultado
    fun nombre_de_la_funcion(numA: Int, numB: Int): Int {
        return numA + numB
    }

    fun funcion2(numA: Int, numB: Int) {
        nombre_de_la_funcion(numA, 8)
    }

}