package com.aldikitta.core.domain.usecase

import androidx.paging.PagingData
import com.aldikitta.core.domain.repository.MovieRepository
import com.aldikitta.core.model.UserItemModel
import kotlinx.coroutines.flow.Flow

class GetUsers(private val movieRepository: MovieRepository) {
    operator fun invoke(query: String): Flow<PagingData<UserItemModel>> =
        movieRepository.getUsers(query = query)
}