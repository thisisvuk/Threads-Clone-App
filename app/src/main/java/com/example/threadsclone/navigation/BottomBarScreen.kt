package com.example.threadsclone.navigation

import com.example.threadsclone.R

sealed class BottomBarScreen(val route: String, val title: String, val icon: Int) {

    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.home_filled
    )
    object Search : BottomBarScreen(
        route = "search",
        title = "Search",
        icon = R.drawable.search
    )
    object Write : BottomBarScreen(
        route = "write",
        title = "Write",
        icon = R.drawable.write
    )
    object Activity : BottomBarScreen(
        route = "activity",
        title = "Activity",
        icon = R.drawable.activity
    )
    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.profile
    )

}
