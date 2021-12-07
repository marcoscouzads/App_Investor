package com.marcoscsouzads.marcos_cassiano_dr1_tp3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.Navigation
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.ActivityMainBinding
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.ActivityQuestionBinding
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.FragmentQuestionOneBinding
import com.marcoscsouzads.marcos_cassiano_dr1_tp3.databinding.FragmentQuestionThreeBinding


class QuestionThreeFragment : Fragment() {
    private var _binding: FragmentQuestionThreeBinding? = null
    private val binding get() = _binding!!

    var pontos: Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestionThreeBinding.inflate(inflater, container, false)


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
                Navigation.findNavController(view).navigate(R.id.action_questionThreeFragment_to_questionFourFragment)
            }
            else if(rdBtn2.isChecked){
                pontos = 1
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionThreeFragment_to_questionFourFragment)
            }
            else if(rdBtn3.isChecked){
                pontos = 2
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionThreeFragment_to_questionFourFragment)
            }
            else if(rdBtn4.isChecked){
                pontos = 4
                PONTUACAO_FINAL += pontos
                Navigation.findNavController(view).navigate(R.id.action_questionThreeFragment_to_questionFourFragment)
            }
            else{error("escolha uma opção")}

        }
        return view

    }

}