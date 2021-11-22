package br.com.apprepository.domain

import br.com.apprepository.core.UseCase
import br.com.apprepository.data.model.Repo
import br.com.apprepository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoryUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {


    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}