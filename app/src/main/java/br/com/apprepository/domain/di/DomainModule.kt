package br.com.apprepository.domain.di

import br.com.apprepository.data.di.DataModule
import br.com.apprepository.domain.ListUserRepositoryUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module {
        return module {
            factory { ListUserRepositoryUseCase(get()) }
        }
    }
}