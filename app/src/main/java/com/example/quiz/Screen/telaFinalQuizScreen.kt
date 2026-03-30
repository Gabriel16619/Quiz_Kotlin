package com.example.quiz.Screen

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun telaFinalScreen(modifier: Modifier = Modifier, navController: NavController) {

    val Cor = Color(98,219,251,255)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxWidth().padding(40.dp)
        ) {
            ImagemLogo(
                modifier = Modifier.align(Alignment.TopCenter)
                    .fillMaxWidth()
                    .height(150.dp)
                    .width(150.dp)
                    .padding(top = 60.dp)

            )
        }
        Box(
            modifier = Modifier.fillMaxWidth().height(250.dp).background(Cor),
        ){
            Box(
                modifier = Modifier.fillMaxWidth().height(80.dp),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier= Modifier
                        .width(300.dp)
                        .height(100.dp)
                        .padding(top = 20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor =    Color(0xFF5FDA86)
                    ),
                    border = BorderStroke(2.dp, Color.Black)
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .padding(top = 18.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Bom trabalho!",
                            textAlign = TextAlign.Center,
                            fontSize = 24.sp
                        )
                    }

                }

            }
            Box(
                modifier = Modifier.fillMaxWidth().height(80.dp).align(Alignment.BottomCenter)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Voce acertou $()",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

        }
        Box(
            modifier = Modifier.fillMaxWidth().height(100.dp)
        ) {
            Button(
                modifier = Modifier.align(Alignment.Center)
                    .width(330.dp)
                    .height(50.dp)
                    .padding(bottom = 10.dp),
                onClick = {navController.navigate("TelaInicio")},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow
                ),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Jogar Novamente",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}