package com.example.naigationactivity

import androidx.navigation.fragment.findNavController
import com.example.library.binding.BindingFragment
import com.example.naigationactivity.databinding.FragmentSecondBinding

class SecondFragment : BindingFragment<FragmentSecondBinding>(R.layout.fragment_second) {
    override fun init() {
        super.init()
        binding.dialog.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_dialogFragment)
        }
    }
}