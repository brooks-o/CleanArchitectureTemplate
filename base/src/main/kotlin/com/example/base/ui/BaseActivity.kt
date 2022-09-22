package com.example.base.ui

import android.content.Intent
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseActivity<B : ViewDataBinding>(
    @LayoutRes
    private val layoutResId: Int
) : AppCompatActivity(), BaseUIFunction {

    val EXTRA_BUNDLE = "EXTRA_BUNDLE"

    lateinit var binding: B
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.inflate(layoutInflater, layoutResId, null, false)

        binding.lifecycleOwner = this@BaseActivity

        setContentView(binding.root)

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
        val intent = Intent(this, cls)

        args?.let {
            intent.putExtra(EXTRA_BUNDLE, args)
        }

        intent.apply {
            addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            addFlags(Intent.FLAG_ACTIVITY_NO_USER_ACTION)
        }
        startActivity(intent)
        overridePendingTransition(0, 0)
    }

    fun goToFragment(id: Int, cls: Class<*>, args: Bundle? = null) {
        try {
            val fragment = cls.newInstance() as Fragment
            fragment.arguments = args
            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction().replace(id, fragment).commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun goToFragment(id: Int, fragment: Fragment, args: Bundle? = null) {
        try {
            fragment.arguments = args
            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction().replace(id, fragment).commitAllowingStateLoss()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun removeFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss()
    }
}