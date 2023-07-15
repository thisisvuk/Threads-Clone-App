package com.example.threadsclone.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.threadsclone.R

@Composable
fun Thread(
    @DrawableRes profile: Int = R.drawable.thisisvuk,
    username: String = "thisisvuk",
    time: String = "7h",
    text: String = "Hello, India! \uD83C\uDDEE\uD83C\uDDF3",
    @DrawableRes images: List<Int> = listOf(R.drawable.sg),
    replies: Int = 26,
    likes: Int = 14,
    isVerified: Boolean = false,
    isLiked: Boolean = false,
    isFollowing: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .padding(horizontal = 15.dp, vertical = 10.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxHeight()
        ) {
            Box(modifier = Modifier.size(40.dp)) {
                Image(
                    painter = painterResource(id = profile),
                    contentDescription = "profile",
                    modifier = Modifier.size(40.dp).clip(CircleShape)
                )
                if (!isFollowing) {
                    Image(
                        painter = painterResource(id = R.drawable.add),
                        contentDescription = "profile",
                        modifier = Modifier
                            .size(15.dp)
                            .align(Alignment.BottomEnd)
                            .background(Color.White, shape = CircleShape)
                            .border(
                                1.dp,
                                Color.White,
                                CircleShape
                            )
                    )
                }
            }
            Spacer(Modifier.height(5.dp))
            Divider(
                modifier = Modifier
                    .weight(1f)
                    .width(1.dp),
                color = Color.Gray
            )
            Spacer(Modifier.height(3.dp))
            Box(modifier = Modifier.size(width = 36.dp, height = 30.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.u1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(15.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterStart)
                )
                Image(
                    painter = painterResource(id = R.drawable.u2),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                        .align(Alignment.TopEnd)
                )

                Image(
                    painter = painterResource(id = R.drawable.u3),
                    contentDescription = null,
                    modifier = Modifier
                        .size(10.dp)
                        .clip(CircleShape)
                        .align(Alignment.BottomCenter)
                )
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = username,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.width(5.dp))
                if (isVerified) {
                    Image(
                        painter = painterResource(id = R.drawable.blue_tick),
                        contentDescription = null,
                        Modifier.size(15.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = time, color = Color.Gray,
                    fontWeight = FontWeight.Light
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    painter = painterResource(id = R.drawable.post_more),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = text,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            if (images.isNotEmpty()) {
                Image(
                    painter = painterResource(id = images[0]),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp)),
                )
                Spacer(modifier = Modifier.height(15.dp))
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Icon(
                    painter = painterResource(id = if (isLiked) R.drawable.like_filled else R.drawable.like),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = if(isLiked) Color(0xFFEA333E) else Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.comment),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.repost),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(text = "$replies replies", color = Color.Gray, fontSize = 14.sp)
                Text(text = "•", color = Color.Gray, fontSize = 14.sp)
                Text(text = "$likes likes", color = Color.Gray, fontSize = 14.sp)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ThreadPreview() {
    Thread()
}