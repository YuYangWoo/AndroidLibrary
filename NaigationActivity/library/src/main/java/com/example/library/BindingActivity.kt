package com.example.library

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

open class BindingActivity<VB: ViewDataBinding>(private val layoutId: Int) : BaseActivity() {
    protected val binding: VB by lazy { DataBindingUtil.setContentView(this, layoutId)}

    override fun init() {
        super.init()
        binding.lifecycleOwner = this
    }
}