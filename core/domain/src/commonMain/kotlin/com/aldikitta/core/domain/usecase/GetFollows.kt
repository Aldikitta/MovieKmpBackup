package com.aldikitta.core.domain.usecase

import androidx.paging.PagingData
import com.aldikitta.core.domain.repository.MovieRepository
import com.aldikitta.core.model.FollowItemModel
import kotlinx.coroutines.flow.Flow

class GetFollows(private val movieRepository: MovieRepository) {
    operator fun invoke(username: String, type: String): Flow<PagingData<FollowItemModel>> =
        movieRepository.getFollows(username = username, type = type)
}