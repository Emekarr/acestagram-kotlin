package com.example.acestagram.screens.loginscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.acestagram.R
import com.example.acestagram.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {
    private lateinit var binding: LoginFragmentBinding
    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.login_fragment, container, false)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        // navigate back to signup page
        navigateToSignUpPage()

        return binding.root
    }

    private fun navigateToSignUpPage(){
        binding.signUp.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
    }
}