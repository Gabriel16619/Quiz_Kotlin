package com.example.quiz.telaInicial


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz.R


@Composable
fun telaInicio(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(77, 206, 255, 234)),
        verticalArrangement = Alignment.CenterVertically as Arrangement.Vertical
    ) {
        Box(
            modifier = Modifier.background(Color.Black)
        ){
            ImagemLogo(
                modifier = Modifier
                    .size(60.dp),
                color = Color.Black
            )
        }
        Text (
            modifier = Modifier
                .background(Color.Black),

            textAlign = TextAlign.Start,
            text = "QUIZATRON 3000",
            color = Color.White,
            fontFamily = FontFamily.Monospace,

            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow
            ),
            modifier = Modifier
        ) {
            Text(
                text = "Começar!!",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.Blue
            )
        }
    }
}

@Composable
fun ImagemLogo(modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "LogoImage",
        painter = painterResource(R.drawable.quiz),
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}