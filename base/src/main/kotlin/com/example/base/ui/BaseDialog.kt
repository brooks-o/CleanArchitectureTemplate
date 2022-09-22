package com.example.base.ui

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDialog<B : ViewDataBinding>(
    context: Context,
    @LayoutRes
    val layoutResId: Int
) : Dialog(context), BaseUIFunction {

    lateinit var binding: B
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            DataBindingUtil.inflate(LayoutInflater.from(this.context), layoutResId, null, false)

        setupBinding()
        setupData()
        setupClickListener()
        setupUI()
        setupObserver()

        setContentView(binding.root)
    }

    override fun setupBinding() {}
    override fun setupData() {}
    override fun setupClickListener() {}
    override fun setupUI() {}
    override fun setupObserver() {}

    override fun onBackPressed() {
        super.onBackPressed()
        dismiss()
    }
}