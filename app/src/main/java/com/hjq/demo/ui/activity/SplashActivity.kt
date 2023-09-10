package com.hjq.demo.ui.activity

import android.content.Intent
import android.view.View
import com.hjq.demo.R
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.HomeActivityBinding
import com.hjq.demo.databinding.SplashActivityBinding
import org.jetbrains.anko.startActivity

class SplashActivity : AppActivity() {

    private lateinit var binding: SplashActivityBinding

    override fun getLayoutView(): View {
        binding = SplashActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        postDelayed({
            startActivity<SplashViewActivity>()
        }, 3000)
    }

    override fun initData() {
    }


    override fun onBackPressed() {
    }

    override fun initActivity() {
        if (!isTaskRoot) {
            val intent: Intent? = intent
            if (((intent != null) && intent.hasCategory(Intent.CATEGORY_LAUNCHER)
                        && (Intent.ACTION_MAIN == intent.action))
            ) {
                finish()
                return
            }
        }
        super.initActivity()
    }
}