package com.marcoscsouzads.marcos_cassiano_dr1_tp3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.FragmentQuestionOneBinding


class QuestionOneFragment : Fragment() {
    private var _binding: FragmentQuestionOneBinding? = null
    private val binding get() = _binding!!

    var pontos: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestionOneBinding.inflate(inflater, container, false)

        val view = binding.root

        val rdBtn1: RadioButton = binding.radioBtn1
        val rdBtn2: RadioButton = binding.radioBtn2
        val rdBtn3: RadioButton = binding.radioBtn3
        val rdBtn4: RadioButton = binding.radioBtn4

        binding.btnNext.setOnClickListener {
            pontos = PONTUACAO_FINAL

            if (rdBtn1.isChecked){
                pontos = 0
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionOneFragment_to_questionTwoFragment)
            }
            else if(rdBtn2.isChecked){
                pontos = 2
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionOneFragment_to_questionTwoFragment)
            }
            else if(rdBtn3.isChecked){
                pontos = 3
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionOneFragment_to_questionTwoFragment)
            }
            else if(rdBtn4.isChecked){
                pontos = 4
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionOneFragment_to_questionTwoFragment)
            }
            else{error("escolha uma opção")}
        }
        return view
    }


}