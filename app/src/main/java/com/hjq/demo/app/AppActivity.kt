package com.hjq.demo.app

import android.content.Intent
import android.graphics.Point
import android.os.Bundle
import android.view.View
import com.hjq.base.BaseActivity
import com.hjq.demo.R

/**
 *    author : Bùi Hửu Thắng
 *    time   : 2018/10/18
 */
abstract class AppActivity : BaseActivity() {

    private var maxSizePoint = Point()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        windowManager.defaultDisplay.getSize(maxSizePoint)
    }

    override fun startActivityForResult(intent: Intent, requestCode: Int, options: Bundle?) {
        super.startActivityForResult(intent, requestCode, options)
        overridePendingTransition(R.anim.right_in_activity, R.anim.right_out_activity)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.left_in_activity, R.anim.left_out_activity)
    }
}