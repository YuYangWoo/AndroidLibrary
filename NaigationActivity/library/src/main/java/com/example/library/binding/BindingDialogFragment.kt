package com.example.library.binding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.library.base.BaseDialogFragment

open class BindingDialogFragment<VB: ViewDataBinding>(private val layoutId: Int) : BaseDialogFragment() {
    protected lateinit var binding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        init()
        return binding.root
    }

    private fun init() {

    }
}