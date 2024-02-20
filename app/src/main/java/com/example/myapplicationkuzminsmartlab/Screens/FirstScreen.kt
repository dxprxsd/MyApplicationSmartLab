package com.example.myapplicationkuzminsmartlab.Screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplicationkuzminsmartlab.R
import kotlinx.coroutines.delay
import androidx.navigation.NavHostController


//@Preview
@Composable
fun SmartLabFirstScreen(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
        LaunchedEffect(key1 = true) {
            delay(1500L)
            navController.navigate("LogScreen") {
                popUpTo("greetingScreen")
                {
                    inclusive = true
                }
            }
        }
    }

    val gradient = Brush.linearGradient(
        0.05f to Color(android.graphics.Color.parseColor("#6269F0")),
        0.65f to Color(android.graphics.Color.parseColor("#3740F5")),
        1.0f to Color(android.graphics.Color.parseColor("#2254F5")),
        0.65f to Color(android.graphics.Color.parseColor("#3740F5")),
        0.05f to Color(android.graphics.Color.parseColor("#6269F0")),
        1.0f to Color(android.graphics.Color.parseColor("#74C8E4")),
        1.0f to Color(android.graphics.Color.parseColor("#73D5BC")),
        1.0f to Color(android.graphics.Color.parseColor("#74C8E4")),
        1.0f to Color(android.graphics.Color.parseColor("#A1CAFF")),
        1.0f to Color(android.graphics.Color.parseColor("#4D9CFF")),
        1.0f to Color(android.graphics.Color.parseColor("#A1CAFF")),
        start = Offset.Infinite,
        end = Offset.Zero
    )
    Column(modifier = Modifier
        .background(gradient)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row(verticalAlignment = Alignment.CenterVertically)
        {
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .width(263.dp)
                        .height(47.77.dp)
                )
            }
        }
    }
}