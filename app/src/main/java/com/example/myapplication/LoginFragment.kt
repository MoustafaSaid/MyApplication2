package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentLoginBinding


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View ?{
        val  binding: FragmentLoginBinding =DataBindingUtil.inflate(
            inflater,R.layout.fragment_login,container,false
        )
//        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
//            inflater, R.layout.fragment_login,false
//        )
        binding.loginbutton1.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_welcomeFragment)
        )
        binding.loginbutton2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_welcomeFragment)
        )
        return binding.root
    }

}