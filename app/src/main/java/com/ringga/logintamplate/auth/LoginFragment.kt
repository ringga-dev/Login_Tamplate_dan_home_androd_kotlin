package com.ringga.logintamplate.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ringga.logintamplate.R
import com.ringga.logintamplate.databinding.FragmentLoginBinding
import com.ringga.logintamplate.home.HomeActivity
import com.ringga.logintamplate.home.HomeDrawingActivity

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.register.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerAuth, RegisterFragment()).commit()
        }
        binding.btnLogin.setOnClickListener {
           activity?.startActivity(Intent(requireContext(), HomeDrawingActivity::class.java))
        }
    }
}