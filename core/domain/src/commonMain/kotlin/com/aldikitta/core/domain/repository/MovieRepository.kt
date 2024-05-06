package com.aldikitta.core.domain.repository

import androidx.paging.PagingData
import com.aldikitta.core.model.DetailModel
import com.aldikitta.core.model.FollowItemModel
import com.aldikitta.core.model.RepositoryItemModel
import com.aldikitta.core.model.UserItemModel
import com.aldikitta.core.utils.UiState
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun getUsers(query: String): Flow<PagingData<UserItemModel>>

    fun getDetail(username: String): Flow<UiState<DetailModel>>

    fun getFollows(username: String, type: String): Flow<PagingData<FollowItemModel>>

    fun getRepositories(username: String): Flow<PagingData<RepositoryItemModel>>
}