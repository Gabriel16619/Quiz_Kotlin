package com.example.quiz.ui.theme

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quiz.ImagemLogo

@Composable
fun telaFinalScreen(modifier: Modifier = Modifier) {

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
                        .width(200.dp)
                        .height(60.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.white)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .padding(top = 18.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Bom trabalho!",
                            textAlign = TextAlign.Center,
                        )
                    }

                }

            }

        }
    }
}