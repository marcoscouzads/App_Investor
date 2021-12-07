package com.marcoscsouzads.marcos_cassiano_dr1_tp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.Navigation
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.FragmentQuestionSixBinding
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.FragmentQuestionTwoBinding


class QuestionSixFragment : Fragment() {
    private var _binding: FragmentQuestionSixBinding? = null
    private val binding get() = _binding!!
    var pontos: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestionSixBinding.inflate(inflater, container, false)
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
                Navigation.findNavController(view).navigate(R.id.action_questionSixFragment_to_questionSevenFragment)
            }
            else if(rdBtn2.isChecked){
                pontos = 2
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionSixFragment_to_questionSevenFragment)
            }
            else if(rdBtn3.isChecked){
                pontos = 3
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionSixFragment_to_questionSevenFragment)
            }
            else if(rdBtn4.isChecked){
                pontos = 4
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionSixFragment_to_questionSevenFragment)

            }
            else{error("escolha uma opção")}
        }
        return view
    }

}