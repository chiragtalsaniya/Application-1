package com.rmus.myapplication

import android.app.Application

class AppModule : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}