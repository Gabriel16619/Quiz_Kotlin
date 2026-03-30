package com.example.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quiz.Screen.telaDoisScreen
import com.example.quiz.Screen.telaFinalScreen
import com.example.quiz.ui.theme.QuizTheme
import com.example.quiz.Screen.telaInicio
import com.example.quiz.Screen.telaQuatroScreen
import com.example.quiz.Screen.telaTresScreen
import com.example.quiz.Screen.telaUmScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "TelaInicio"
                    ) {
                        composable(route = "TelaInicio") {
                            telaInicio(modifier = Modifier.padding(innerPadding), navController)
                        }

                        composable(route = "TelaUm") {
                            telaUmScreen(modifier = Modifier.padding(innerPadding), navController)
                        }

                        composable(route = "TelaDois") {
                            telaDoisScreen(modifier = Modifier.padding(innerPadding), navController)
                        }

                        composable(route = "TelaTres") {
                            telaTresScreen(modifier = Modifier.padding(innerPadding), navController)
                        }

                        composable(route = "TelaQuatro") {
                            telaQuatroScreen(modifier = Modifier.padding(innerPadding), navController)
                        }

                        composable(route = "TelaFinal") {
                            telaFinalScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}


