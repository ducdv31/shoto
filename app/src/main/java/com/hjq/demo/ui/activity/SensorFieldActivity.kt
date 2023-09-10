package com.hjq.demo.ui.activity

import android.view.View
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.SensorFieldActivityBinding

class SensorFieldActivity : AppActivity() {
    private lateinit var binding: SensorFieldActivityBinding


    override fun getLayoutView(): View {
        binding = SensorFieldActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        binding.imvBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

    }

    override fun initData() {
    }
}