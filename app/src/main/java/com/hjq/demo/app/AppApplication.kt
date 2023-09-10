package com.hjq.demo.app

import android.app.Application

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initSdk(this)
    }

    companion object {

        fun initSdk(application: Application) {

        }
    }
}