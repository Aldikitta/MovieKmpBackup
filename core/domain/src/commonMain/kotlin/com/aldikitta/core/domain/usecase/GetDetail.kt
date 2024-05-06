package com.aldikitta.core.domain.usecase

import com.aldikitta.core.domain.repository.MovieRepository
import com.aldikitta.core.model.DetailModel
import com.aldikitta.core.utils.UiState
import kotlinx.coroutines.flow.Flow

class GetDetail(private val movieRepository: MovieRepository) {
    operator fun invoke(username: String): Flow<UiState<DetailModel>> =
        movieRepository.getDetail(username)
}