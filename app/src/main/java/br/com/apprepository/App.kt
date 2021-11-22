package br.com.apprepository

import android.app.Application
import br.com.apprepository.data.di.DataModule
import br.com.apprepository.domain.di.DomainModule
import br.com.apprepository.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }

}