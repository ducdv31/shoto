package com.hjq.demo.ui.activity

import android.view.View
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.SettingTimeActivityBinding
import com.hjq.demo.ui.dialog.MessageDialog

class SettingTimeActivity : AppActivity() {
    private lateinit var binding: SettingTimeActivityBinding

    override fun getLayoutView(): View {
        binding = SettingTimeActivityBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun initView() {
        binding.imvBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.llSave.setOnClickListener {
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