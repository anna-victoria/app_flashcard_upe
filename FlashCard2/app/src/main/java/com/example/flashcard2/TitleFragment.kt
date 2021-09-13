package com.example.flashcard2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.flashcard2.databinding.FragmentMenuPrincipalBinding

class TitleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMenuPrincipalBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_menu_principal, container, false)
        binding.addflashcardbutton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_titleFragment3_to_configurarCartao2)
        }
        binding.button2.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_titleFragment3_to_verCartoes) }
        return binding.root
    }
}