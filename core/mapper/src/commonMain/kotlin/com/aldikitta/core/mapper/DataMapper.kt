package com.aldikitta.core.mapper

import androidx.compose.ui.graphics.Color
import com.aldikitta.core.dto.DetailResponse
import com.aldikitta.core.dto.FollowItemResponse
import com.aldikitta.core.dto.RepositoryResponse
import com.aldikitta.core.dto.UserResponse
import com.aldikitta.core.model.DetailModel
import com.aldikitta.core.model.FollowItemModel
import com.aldikitta.core.model.RepositoryItemModel
import com.aldikitta.core.model.UserItemModel

object DataMapper {
    fun UserResponse.UserItemResponse.mapToUserItemModel(): UserItemModel = UserItemModel(
        id = id,
        login = login,
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
    )

    fun DetailResponse.mapToDetailModel(): DetailModel = DetailModel(
        id = id,
        login = login,
        avatarUrl = avatarUrl,
        followers = followers,
        following = following,
        publicRepos = publicRepos,
        name = name,
        bio = bio,
        company = company,
    )

    fun FollowItemResponse.mapToFollowItemModel(): FollowItemModel = FollowItemModel(
        id = id,
        avatarUrl = avatarUrl,
        login = login,
    )

    fun RepositoryResponse.RepositoryItemResponse.mapToRepositoryItemModel(color: Color): RepositoryItemModel =
        RepositoryItemModel(
            id = id,
            name = name,
            language = language,
            visibility = visibility,
            color = color,
        )
}