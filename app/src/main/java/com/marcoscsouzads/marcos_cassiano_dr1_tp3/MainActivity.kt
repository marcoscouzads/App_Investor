package com.marcoscsouzads.marcos_cassiano_dr1_tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val nomeUsuario: String = binding.editTextName.text.toString()

            if (nomeUsuario == ""){
                Toast.makeText(this,
                "Digite um nome para continuar!",
                Toast.LENGTH_LONG).show()
            }else{
                val proximaTela = Intent(this, QuestionActivity::class.java)
                proximaTela.putExtra(NOME_USUARIO, nomeUsuario)
                startActivity(proximaTela)
            }


        }
    }

}