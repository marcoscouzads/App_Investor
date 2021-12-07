package com.marcoscsouzads.marcos_cassiano_dr1_tp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private var _binding: ActivityResultBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pontos = PONTUACAO_FINAL
        binding.textResult.text = "Pontuação final $pontos"

        val nome = intent.getStringExtra(NOME_USUARIO)
        binding.textNome.text = "Nome do usuario: $nome"

        //var perfil = binding.textPerfil.text = "seu perfil é"

        if (pontos <= 12){
            binding.textPerfil.text = "Perfil: Conservador"
        }
        else if (pontos > 13 && pontos <= 29 ){
            binding.textPerfil.text = "Perfil: Moderado"
        }
        else if (pontos >= 30){
            binding.textPerfil.text = "Perfil: Arrojado"
        }


    }
}