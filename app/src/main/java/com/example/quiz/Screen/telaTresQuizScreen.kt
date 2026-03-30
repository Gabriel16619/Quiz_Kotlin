package com.example.quiz.Screen



import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun telaTresScreen(modifier: Modifier = Modifier, navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE98CB5)),

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
            modifier = Modifier.fillMaxWidth().height(100.dp), contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .width(230.dp)
                    .background(Color.Yellow, shape = RoundedCornerShape(16.dp))
                    .border(2.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .height(50.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Pergunta 3 de 4",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,

                    )
            }
        }

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .height(400.dp)
                    .width(350.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.white)
                )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    contentAlignment = Alignment.TopCenter
                ){
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = "Qual o coletivo de Borboleta?",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontWeight =  FontWeight.SemiBold,
                        color = Color.Black
                    )
                }

                Box(
                    modifier = Modifier

                        .fillMaxWidth()
                        .height(70.dp),

                    ) {
                    Button(
                        modifier = Modifier.align(Alignment.Center)
                            .width(330.dp)
                            .height(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White
                        ),
                        border = BorderStroke(2.dp, Color.Black)
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Borboletas",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Start
                        )
                    }

                }
                Box(
                    modifier = Modifier

                        .fillMaxWidth()
                        .height(70.dp)

                ) {
                    Button(
                        modifier = Modifier.align(Alignment.Center)
                            .width(330.dp)
                            .height(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White
                        ),
                        border = BorderStroke(2.dp, Color.Black)
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enxame",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Start
                        )
                    }

                }
                Box(
                    modifier = Modifier

                        .fillMaxWidth()
                        .height(70.dp)

                ) {
                    Button(
                        modifier = Modifier.align(Alignment.Center)
                            .width(330.dp)
                            .height(50.dp),
                        onClick = {navController.navigate("TelaQuatro")},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White
                        ),
                        border = BorderStroke(2.dp, Color.Black)
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Panapaná",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Start
                        )
                    }

                }
                Box(
                    modifier = Modifier

                        .fillMaxWidth()
                        .height(70.dp)

                ) {
                    Button(
                        modifier = Modifier.align(Alignment.Center)
                            .width(330.dp)
                            .height(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White
                        ),
                        border = BorderStroke(2.dp, Color.Black)
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Carreiro",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Start
                        )
                    }

                }

            }
        }
        Box(
            modifier = Modifier

                .fillMaxWidth()
                .height(70.dp)

        ) {
            Button(
                modifier = Modifier.align(Alignment.Center)
                    .width(330.dp)
                    .height(50.dp),
                onClick = {navController.navigate("TelaDois")},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green
                ),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Voltar para Anterior",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
            }

        }

    }
}

