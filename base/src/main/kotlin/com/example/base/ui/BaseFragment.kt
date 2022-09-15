package com.example.base.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<B : ViewDataBinding>(
    @LayoutRes
    private val layoutResId: Int
) : Fragment(), BaseUIFunction {

    protected lateinit var binding: B
        private set

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, layoutResId, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.lifecycleOwner = this@BaseFragment

        setupBinding()
        setupData()
        setupClickListener()
        setupUI()
        setupObserver()
    }

    override fun setupBinding() {}
    override fun setupData() {}
    override fun setupClickListener() {}
    override fun setupUI() {}
    override fun setupObserver() {}

    fun goToActivity(cls: Class<*>, args: Bundle? = null) {
        (activity as? BaseActivity<*>)?.goToActivity(cls, args)
    }

    fun goToFragment(id: Int, cls: Class<*>, args: Bundle? = null) {
        (activity as? BaseActivity<*>)?.goToFragment(id, cls, args)
    }

    fun goToFragment(id: Int, fragment: Fragment, args: Bundle? = null) {
        (activity as? BaseActivity<*>)?.goToFragment(id, fragment, args)
    }

    fun removeFragment(fragment: Fragment) {
        (activity as? BaseActivity<*>)?.removeFragment(fragment)
    }
}