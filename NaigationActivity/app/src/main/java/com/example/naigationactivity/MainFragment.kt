package com.example.naigationactivity

import androidx.navigation.fragment.findNavController
import com.example.library.binding.BindingFragment
import com.example.naigationactivity.databinding.FragmentMainBinding

class MainFragment : BindingFragment<FragmentMainBinding>(R.layout.fragment_main) {

    override fun init() {
        super.init()
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }
    }
}