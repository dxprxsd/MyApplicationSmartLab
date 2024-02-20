package com.example.myapplicationkuzminsmartlab.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay
import com.example.myapplicationkuzminsmartlab.R


@OptIn(ExperimentalMaterial3Api::class)
//@Preview
@Composable
fun CodeScreen(navController: NavHostController) {
    val num = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start

        ) {
            Button(
                onClick = { navController.navigate("LogScreen") }, //
                modifier = Modifier
                    .padding(top = 30.dp, start = 30.dp)
                    .width(32.dp)
                    .height(32.00.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF5F5F9),
                    disabledContentColor = Color(0xFFC9D4FB)
                ),
                border = BorderStroke(2.dp, color = Color.LightGray),
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icons),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 150.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Введите код по E-mail",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Row() {

                TextField(
                    value = num.value,
                    onValueChange = { newText -> num.value = newText },
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .size(55.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color(0xFFF5F5F9),
                        unfocusedIndicatorColor = Color(0xFFF5F5F9),
                        cursorColor = Color.Black,
                        unfocusedPlaceholderColor = Color(0xFF939396)
                    ),
                    shape = RoundedCornerShape(15.dp),
                    maxLines = 1,
                    singleLine = true
                )
                TextField(
                    value = num.value,
                    onValueChange = { newText -> num.value = newText },
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .size(55.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color(0xFFF5F5F9),
                        unfocusedIndicatorColor = Color(0xFFF5F5F9),
                        cursorColor = Color.Black,
                        unfocusedPlaceholderColor = Color(0xFF939396)
                    ),
                    shape = RoundedCornerShape(15.dp),
                    maxLines = 1,
                    singleLine = true
                )
                TextField(
                    value = num.value,
                    onValueChange = { newText -> num.value = newText },
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .size(55.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color(0xFFF5F5F9),
                        unfocusedIndicatorColor = Color(0xFFF5F5F9),
                        cursorColor = Color.Black,
                        unfocusedPlaceholderColor = Color(0xFF939396)
                    ),
                    shape = RoundedCornerShape(15.dp),
                    maxLines = 1,
                    singleLine = true
                )
                TextField(
                    value = num.value,
                    onValueChange = { newText -> num.value = newText },
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .size(55.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color(0xFFF5F5F9),
                        unfocusedIndicatorColor = Color(0xFFF5F5F9),
                        cursorColor = Color.Black,
                        unfocusedPlaceholderColor = Color(0xFF939396)
                    ),
                    shape = RoundedCornerShape(15.dp),
                    maxLines = 1,
                    singleLine = true
                )
            }
            Text(
                text = "Отправить код повторно можно",
                fontSize = 15.sp,
                color = Color(0xFF939396),
            )
            var timer by remember { mutableStateOf(60) }
            LaunchedEffect(key1 = timer) {

                if (timer > 0) {
                    delay(1000)
                    timer -= 1
                }
            }
            Text(
                text = "будет через " + timer.toString() + " секунд",
                fontSize = 15.sp,
                color = Color(0xFF939396)
            )
        }

    }
}
