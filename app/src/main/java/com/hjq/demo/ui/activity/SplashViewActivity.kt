package com.hjq.demo.ui.activity

import android.content.Intent
import android.view.View
import com.hjq.demo.R
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.SplashActivityBinding
import com.hjq.demo.databinding.SplashviewActivityBinding
import org.jetbrains.anko.startActivity

class SplashViewActivity : AppActivity() {

    private lateinit var binding: SplashviewActivityBinding

    override fun getLayoutView(): View {
        binding = SplashviewActivityBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun initView() {
        postDelayed({
            startActivity<HomeActivity>()
        }, 5000)
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