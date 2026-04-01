package com.example.quiz

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {

    var pontuacao by mutableStateOf(0)
        private set

    fun responder(respostaSelecionada: Int, respostaCorreta: Int) {
        if (respostaSelecionada == respostaCorreta) {
            pontuacao++
        }
    }

    fun resetar() {
        pontuacao = 0
    }
}