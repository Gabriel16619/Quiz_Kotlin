package com.example.quiz

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun telaInicio(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(77, 206, 255, 234)),
            verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            ImagemLogo(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            )
        }
        Text (
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),


            textAlign = TextAlign.Center,
            text = "QUIZATRON 3000",
            color = Color.Black,
            fontFamily = FontFamily.Monospace,

            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Box(
            modifier = Modifier.fillMaxWidth().padding(30.dp)
        ) {
            Button(
                modifier = Modifier.align(Alignment.BottomCenter),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,

                )
            ) {
                Text(
                    text = "Começar!!",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp,
                    color = Color.Black
                )
            }
        }

    }
}

@Composable
fun ImagemLogo(modifier: Modifier = Modifier) {
    Image(
        contentDescription = "LogoImage",
        painter = painterResource(R.drawable.quiz),
        modifier = modifier
    )
}