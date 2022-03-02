package com.example.library.binding

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.library.base.BaseActivity

open class BindingActivity<VB: ViewDataBinding>(private val layoutId: Int) : BaseActivity() {
    protected val binding: VB by lazy { DataBindingUtil.setContentView(this, layoutId)}

    override fun init() {
        super.init()
        binding.lifecycleOwner = this
    }
}