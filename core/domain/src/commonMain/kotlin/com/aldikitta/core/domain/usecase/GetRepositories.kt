package com.aldikitta.core.domain.usecase

import androidx.paging.PagingData
import com.aldikitta.core.domain.repository.MovieRepository
import com.aldikitta.core.model.RepositoryItemModel
import kotlinx.coroutines.flow.Flow

class GetRepositories(private val movieRepository: MovieRepository) {
    operator fun invoke(username: String): Flow<PagingData<RepositoryItemModel>> =
        movieRepository.getRepositories(username = username)
}