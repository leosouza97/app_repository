package br.com.apprepository.presentation.di

import br.com.apprepository.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load() {
        loadKoinModules(viewModuleModule())
    }

    private fun viewModuleModule(): Module {
        return module {
            viewModel { MainViewModel(get()) }
        }
    }

}