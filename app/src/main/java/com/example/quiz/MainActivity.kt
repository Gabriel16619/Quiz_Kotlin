package com.example.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.I
import com.example.quiz.ui.theme.QuizTheme
import com.example.quiz.ui.theme.telaDoisScreen
import com.example.quiz.ui.theme.telaFinalScreen
import com.example.quiz.ui.theme.telaQuatroScreen
import com.example.quiz.ui.theme.telaTresScreen
import com.example.quiz.ui.theme.telaUmScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    telaInicio(modifier = Modifier.padding(innerPadding))
//                    telaUmScreen(modifier = Modifier.padding(innerPadding))
//                    telaDoisScreen(modifier = Modifier.padding(innerPadding))
//                   telaTresScreen(modifier = Modifier.padding(innerPadding))
//                    telaQuatroScreen(modifier = Modifier.padding(innerPadding))
                    telaFinalScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
