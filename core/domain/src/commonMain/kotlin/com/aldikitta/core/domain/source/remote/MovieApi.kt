package com.aldikitta.core.domain.source.remote

import com.aldikitta.core.dto.FollowItemResponse
import com.aldikitta.core.dto.RepositoryResponse
import com.aldikitta.core.dto.UserResponse
import io.ktor.client.statement.HttpResponse

interface MovieApi {
    suspend fun getData(
        url: String,
        query: Map<String, Any>? = null
    ): HttpResponse

    suspend fun getDataPagingFollows(
        url: String,
        query: Map<String, Any>? = null
    ): List<FollowItemResponse>

    suspend fun getDataPagingRepositories(
        url: String,
        query: Map<String, Any>? = null
    ): List<RepositoryResponse.RepositoryItemResponse>

    suspend fun getDataPagingUsers(
        url: String,
        query: Map<String, Any>? = null
    ): UserResponse.UsersResponse
}