package com.hjq.demo.ui.activity

import android.view.View
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.SensorCarActivityBinding

class SensorCarActivity : AppActivity() {
    private lateinit var binding: SensorCarActivityBinding


    override fun getLayoutView(): View {
        binding = SensorCarActivityBinding.inflate(layoutInflater)
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