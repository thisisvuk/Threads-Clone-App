package com.example.threadsclone

import androidx.annotation.DrawableRes

data class ThreadData(
    @DrawableRes val profile: Int = R.drawable.thisisvuk,
    val username: String = "thisisvuk",
    val time: String = "7h",
    val text: String = "Hello, India! \uD83C\uDDEE\uD83C\uDDF3",
    @DrawableRes val images: List<Int> = listOf(R.drawable.sg),
    val replies: Int = 26,
    val likes: Int = 14,
    val isVerified: Boolean = false,
    val isLiked: Boolean = false,
    val isFollowing: Boolean = false
)
