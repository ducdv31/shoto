package com.hjq.demo.ui.activity

import android.view.View
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.LoggerSettingActivityBinding
import com.hjq.demo.ui.dialog.MessageDialog
import com.hjq.demo.ui.dialog.PasswordDialog
import org.jetbrains.anko.startActivity

class LoggerSettingActivity : AppActivity() {
    private lateinit var binding: LoggerSettingActivityBinding

    override fun getLayoutView(): View {
        binding = LoggerSettingActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        binding.imvBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.imvSave.setOnClickListener {
            MessageDialog.Builder(
                this,
            ).onActionDone(object : MessageDialog.Builder.OnActionDone {
                override fun onActionDone(isConfirm: Boolean) {

                }

                override fun onActionCancel() {

                }
            }).show()
        }
    }

    override fun initData() {
    }
}