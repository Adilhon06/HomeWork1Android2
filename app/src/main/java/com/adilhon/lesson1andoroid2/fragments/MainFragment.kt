package com.adilhon.lesson1andoroid2.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.adilhon.lesson1andoroid2.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("fragment", "main")
        setupListener()
    }

    private fun setupListener() {
        binding.btnGo.setOnClickListener {
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToSecondFragment(
                    "Name: ${binding.etName.text}\n" +
                            "Email: ${binding.etEmail.text}\n" +
                            "Password ${binding.etPassword.text}"
                )
            )
        }
    }
}