package com.example.myapplicationkuzminsmartlab.Screens

import android.content.res.Configuration
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
            navController.navigate("firstBootScreen") {
                popUpTo("greetingScreen")
                {
                    inclusive = true
                }
            }
        }
    }
    Box(modifier = Modifier
        .fillMaxSize(1f)
        .background(
            Brush.linearGradient(
                colors = listOf(
                    Color(161, 202, 255),
                    Color(77, 156, 255),
                    Color(161, 202, 255)
                ),
                start = Offset(0f, Float.POSITIVE_INFINITY),
                end = Offset(Float.POSITIVE_INFINITY, 0f)
            )
        )
        .background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(116, 200, 228),
                    Color(115, 213, 188),
                    Color(116, 200, 228)
                )
            )
        )
        .background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(98, 105, 240).copy(alpha = 0.05f),
                    Color(55, 64, 245).copy(alpha = 0.65f),
                    Color(34, 84, 245).copy(alpha = 1f),
                    Color(55, 64, 245,).copy(alpha = 0.65f),
                    Color(98, 105, 240,).copy(alpha = 0.05f)
                )
            )
        )
    ){
        Canvas(modifier = Modifier
            .fillMaxSize()
            .blur(radius = 100.dp))
        {
            drawCircle(color = Color(0xFF4460C1), radius = 500f, center = Offset(80f,100f))
            drawCircle(color =  Color(0xFF4460C1), radius = 500f, center = Offset(1000f,2350f))
        }
        Column(modifier = Modifier.fillMaxSize(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
        {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))
        }

    }
}
//    val gradient = Brush.linearGradient(
//        0.05f to Color(android.graphics.Color.parseColor("#6269F0")),
//        0.65f to Color(android.graphics.Color.parseColor("#3740F5")),
//        1.0f to Color(android.graphics.Color.parseColor("#2254F5")),
//        0.65f to Color(android.graphics.Color.parseColor("#3740F5")),
//        0.05f to Color(android.graphics.Color.parseColor("#6269F0")),
//        1.0f to Color(android.graphics.Color.parseColor("#74C8E4")),
//        1.0f to Color(android.graphics.Color.parseColor("#73D5BC")),
//        1.0f to Color(android.graphics.Color.parseColor("#74C8E4")),
//        1.0f to Color(android.graphics.Color.parseColor("#A1CAFF")),
//        1.0f to Color(android.graphics.Color.parseColor("#4D9CFF")),
//        1.0f to Color(android.graphics.Color.parseColor("#A1CAFF")),
//        start = Offset.Infinite,
//        end = Offset.Zero
//    )
//    Column(modifier = Modifier
//        .background(gradient)
//        .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally)
//    {
//        Row(verticalAlignment = Alignment.CenterVertically)
//        {
//            Column(modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally) {
//                Image(
//                    painter = painterResource(id = R.drawable.logo),
//                    contentDescription = "",
//                    modifier = Modifier
//                        .padding(bottom = 50.dp)
//                        .width(263.dp)
//                        .height(47.77.dp)
//                )
//            }
//        }
//    }
//}