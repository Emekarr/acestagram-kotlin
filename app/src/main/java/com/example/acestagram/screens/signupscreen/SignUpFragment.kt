package com.example.acestagram.screens.signupscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.acestagram.R
import com.example.acestagram.databinding.SignUpFragmentBinding

class SignUpFragment : Fragment() {
    private lateinit var binding: SignUpFragmentBinding
    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.sign_up_fragment, container, false)
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)

        //enable signup button
        signUpButtonOnClick()
        // enable navigation to login screen
        navigateToLoginPage()

        return binding.root
    }

    private fun signUpButtonOnClick(){
        binding.signUpButton.setOnClickListener {
            Toast.makeText(requireContext(), "I was tapped", Toast.LENGTH_SHORT).show()
        }
    }

    private fun navigateToLoginPage(){
        binding.signIn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
        }
    }
}
