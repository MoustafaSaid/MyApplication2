package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentInstrucationsBinding

class InstrucationsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentInstrucationsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instrucations, container, false)

        binding.showList.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_instrucationsFragment_to_shoeDetailsFragment)
        )

        return binding.root
    }

}