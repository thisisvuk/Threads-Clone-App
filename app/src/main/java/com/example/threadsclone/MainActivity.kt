package com.example.threadsclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.threadsclone.ui.MainScreen
import com.example.threadsclone.ui.theme.ThreadsCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThreadsCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun SplashScreen() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.threads))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        modifier = Modifier.fillMaxSize(),
        composition = composition,
        progress = { progress },
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThreadsCloneTheme {
        MainScreen()
    }
}