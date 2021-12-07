package com.marcoscsouzads.marcos_cassiano_dr1_tp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {
    private var _binding: ActivityQuestionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(binding.root)
/*
        val ponto = PONTUACAO_FINAL
        binding.textPontos.text = "Pontos: $ponto"

        //val nome = intent.getStringExtra(NOME_USUARIO)
        val nome = NOME_USUARIO
        binding.textNome.text = "Nome do usuario: $nome"
*/

    }
}



