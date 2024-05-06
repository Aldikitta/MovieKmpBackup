package com.aldikitta.core.domain.di

import com.aldikitta.core.domain.usecase.GetDetail
import com.aldikitta.core.domain.usecase.GetFollows
import com.aldikitta.core.domain.usecase.GetRepositories
import com.aldikitta.core.domain.usecase.GetUsers
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetUsers(get()) }
    factory { GetDetail(get()) }
    factory { GetFollows(get()) }
    factory { GetRepositories(get()) }
}