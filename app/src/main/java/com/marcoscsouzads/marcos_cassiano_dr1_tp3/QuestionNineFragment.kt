package com.marcoscsouzads.marcos_cassiano_dr1_tp3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.Navigation
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.FragmentQuestionNineBinding
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.FragmentQuestionTwoBinding


class QuestionNineFragment : Fragment() {
    private var _binding: FragmentQuestionNineBinding? = null
    private val binding get() = _binding!!
    var pontos: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestionNineBinding.inflate(inflater, container, false)
        val view = binding.root

        val rdBtn1: RadioButton = binding.radioBtn1
        val rdBtn2: RadioButton = binding.radioBtn2
        val rdBtn3: RadioButton = binding.radioBtn3
        val rdBtn4: RadioButton = binding.radioBtn4
        val rdBtn5: RadioButton = binding.radioBtn5

        binding.btnNext.setOnClickListener {
            pontos = PONTUACAO_FINAL

            val intent: Intent = Intent(context, ResultActivity::class.java)
            //intent.putExtra(NOME_USUARIO, NOME_USUARIO)

            if (rdBtn1.isChecked){
                pontos = 0
                PONTUACAO_FINAL += pontos
                startActivity(intent as Intent?)
            }
            else if(rdBtn2.isChecked){
                pontos = 1
                PONTUACAO_FINAL += pontos
                startActivity(intent as Intent?)
            }
            else if(rdBtn3.isChecked){
                pontos = 2
                PONTUACAO_FINAL += pontos
                startActivity(intent as Intent?)
            }
            else if(rdBtn4.isChecked){
                pontos = 4
                PONTUACAO_FINAL += pontos
                startActivity(intent as Intent?)
            }
            else if(rdBtn5.isChecked){
                pontos = 5
                PONTUACAO_FINAL += pontos
                startActivity(intent as Intent?)
            }
            else{error("escolha uma opção")}
        }
        return view
    }


}