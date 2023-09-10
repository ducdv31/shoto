package com.hjq.demo.ui.dialog

import android.content.Context
import android.content.res.Resources
import android.view.Gravity
import android.view.LayoutInflater
import com.hjq.base.BaseDialog
import com.hjq.base.action.AnimAction
import com.hjq.demo.databinding.PasswordDialogBinding

class PasswordDialog {
    class Builder constructor(
        context: Context
    ) : BaseDialog.Builder<Builder>(context) {
        private var binding: PasswordDialogBinding =
            PasswordDialogBinding.inflate(LayoutInflater.from(context))

        private lateinit var onActionDone: OnActionDone

        fun onActionDone(onActionDone: OnActionDone): Builder = apply {
            this.onActionDone = onActionDone
        }

        init {
            setCancelable(false)
            setAnimStyle(AnimAction.ANIM_SCALE)
            setGravity(Gravity.CENTER)
            setContentView(binding.root)
            setWidth(Resources.getSystem().displayMetrics.widthPixels * 1 / 3)
            binding.etPassword.requestFocus()
            binding.btnCancel.setOnClickListener {
                dismiss()
                onActionDone.onActionCancel()
            }
            binding.btnConfirm.setOnClickListener {
                dismiss()
                onActionDone.onActionDone(true, binding.etPassword.text.toString())
            }
        }

        interface OnActionDone {
            fun onActionDone(isConfirm: Boolean, reason: String)
            fun onActionCancel()
        }
    }
}