package com.desafio.serasa.app

import android.app.Application
import com.desafio.serasa.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MarvelApplication: Application() {

    override fun onCreate() {
        super.onCreate()
            startKoin(){
                androidLogger()
                androidContext(this@MarvelApplication)
                modules(appModules)
            }
    }

}