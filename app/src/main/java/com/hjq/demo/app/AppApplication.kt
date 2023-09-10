package com.hjq.demo.app

import android.app.Application
import com.hjq.demo.utils.CrashHandler


class AppApplication : Application() {
    private lateinit var mCrashHandler: CrashHandler

    // File Directory in sd card
    val DIRECTORY_NAME = "USBCamera"

    override fun onCreate() {
        super.onCreate()
        initSdk(this)
        mCrashHandler = CrashHandler.getInstance()
        mCrashHandler.init(applicationContext, javaClass)
    }

    companion object {

        fun initSdk(application: Application) {

        }
        const val DIRECTORY_NAME = "USBCamera"
    }
}