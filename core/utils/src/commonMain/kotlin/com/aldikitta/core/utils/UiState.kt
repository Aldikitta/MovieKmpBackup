package com.aldikitta.core.utils

sealed interface UiState<out T : Any> {
    data object Loading : UiState<Nothing>
    data class Success<out T : Any>(val data: T) : UiState<T>
    data class Error(val message: String) : UiState<Nothing>
}