package com.example.myapplicationkuzminsmartlab.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplicationkuzminsmartlab.R


@Composable
fun FirstBootScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {
        Row(
            modifier = Modifier.padding(top = 25.dp, start = 20.dp)
                .clickable { navController.navigate("LogScreen")
                {
                    popUpTo("firstBootScreen")
                    {
                        inclusive = true
                    }
                }
                },
        ) {
            Text(
                text = "Пропустить",
                fontSize = 20.sp,
                color = Color(0xFF57A9FF),
            )
            Icon(
                painter = painterResource(id = R.drawable.subtract),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 100.dp)
                    .width(167.04.dp)
                    .height(163.11.dp),
                tint = Color(0xFF57A9FF)
            )
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "Анализы",
                fontSize = 20.sp,
                color = Color(0xFF00B712)
            )
            Text(
                text = "Экспресс сбор и получение проб",
                fontSize = 14.sp,
                color = Color(0xFF939396),
                modifier = Modifier.padding(top = 25.dp)
            )
            Canvas(modifier = Modifier.fillMaxWidth()){
                drawCircle(
                    color = Color(0xFF57A9FF),
                    radius = 25f,
                    center = Offset(450f, 200f)
                )
                drawCircle(
                    style = Stroke(3f),
                    color = Color(0xFF57A9FF),
                    radius = 25f,
                    center = Offset(550f, 200f)
                )
                drawCircle(
                    style = Stroke(3f),
                    color = Color(0xFf57A9FF),
                    radius = 25f,
                    center = Offset(650f, 200f)
                )
            }
        }
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(    painter = painterResource(id = R.drawable.firstillustration),
                contentDescription = "",    modifier = Modifier
                    .padding(bottom = 50.dp)
                    .width(204.dp)
                    .height(200.47.dp),
                tint = Color.Unspecified
            )
        }
    }
}
