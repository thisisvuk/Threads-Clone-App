package com.example.threadsclone.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.threadsclone.R
import com.example.threadsclone.ThreadData
import com.example.threadsclone.ui.components.Thread

val threads = listOf(
    ThreadData(
        profile = R.drawable.indiancricketteam,
        username = "indiancricketteam",
        time = "5h",
        text = "1️⃣9️⃣8️⃣3️⃣ World Cup-winner \uD83C\uDFC6\n" +
                "233 intl. games\n" +
                "13,214 intl. runs \uD83D\uDC4C\n" +
                "First batter to score 1️⃣0️⃣,0️⃣0️⃣0️⃣ runs in Tests \uD83D\uDC4F \uD83D\uDC4F\n" +
                "\n" +
                "Here's wishing @gavaskarsunilofficial - former #TeamIndia Captain & batting great - a very happy birthday. \uD83D\uDC4F \uD83C\uDF82",
        images = listOf(R.drawable.sg),
        replies = 133,
        likes = 7823,
        isVerified = true,
        isLiked = true,
        isFollowing = true
    ),
    ThreadData(
        profile = R.drawable.indianfootballteam,
        username = "indianfootballteam",
        time = "8h",
        text = "The #eTigers \uD83D\uDC2F start their @fifae Nations Cup 2023 campaign tonight \uD83D\uDC4F\uD83C\uDFFD\uD83D\uDD25\uD83E\uDD29\n" +
                "\n" +
                "Watch \uD83C\uDDEE\uD83C\uDDF3‘s matches LIVE on our YouTube and Twitch channels \uD83D\uDCF1\uD83D\uDCBB",
        images = listOf(R.drawable.match_day),
        replies = 35,
        likes = 1343,
        isVerified = true,
        isLiked = true,
        isFollowing = true
    ),
    ThreadData(
        profile = R.drawable.thisisvuk,
        username = "thisisvuk",
        time = "1d",
        text = "Hello, India! \uD83C\uDDEE\uD83C\uDDF3",
        images = listOf(),
        replies = 1,
        likes = 20,
        isVerified = false,
        isLiked = false,
        isFollowing = false
    )
)

@Composable
fun HomeScreen(navController: NavHostController?) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(bottom = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Icon(
            painter = painterResource(id = R.drawable.threads),
            contentDescription = "logo",
            modifier = Modifier
                .size(30.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        threads.forEach{
            Thread(
                profile = it.profile,
                username = it.username,
                time = it.time,
                text = it.text,
                images = it.images,
                replies = it.replies,
                likes = it.likes,
                isVerified = it.isVerified,
                isLiked = it.isLiked,
                isFollowing = it.isFollowing
            )
            Divider(modifier = Modifier.height(0.5.dp).fillMaxWidth().padding(vertical = 5.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen(null)
}