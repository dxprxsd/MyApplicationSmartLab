package com.example.myapplicationkuzminsmartlab.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplicationkuzminsmartlab.ViewModel.ViewModelMain

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailScreen(navController: NavHostController, viewModel: ViewModelMain) {
    val email = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
        .background(Color.White)
        .padding(horizontal = 20.dp)
        .fillMaxHeight()
    ) {
        Text(
            "🖐 Добро пожаловать!",
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 100.dp)
        )
        Text(
            "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            "Вход по E-mail",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 75.dp),
            color = Color(0xFF939396)
        )
        TextField(
            value = email.value,
            onValueChange = { newText -> email.value = newText },
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth(1f),
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(13.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF5F5F9),
                focusedIndicatorColor = Color(0xFFF5F5F9),
                unfocusedIndicatorColor = Color(0xFFF5F5F9),
                cursorColor = Color.Black,
                unfocusedPlaceholderColor = Color(0xFF939396)
            ),
            placeholder = { Text("example@mail.ru") }
        )

        Button(
            onClick = {
                navController.navigate("EnterCodeScreen")
                viewModel.sendCodeEmail(email.value)},
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 40.dp)
                .height(60.dp),
            enabled = email.value.isNotEmpty(),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1A6FEE),
                disabledContentColor = Color(0xFFC9D4FB)
            ),
        ) {
            Text(
                text = "Далее",
                fontSize = 20.sp,
                color = Color.White
            )

        }
        Text(
            text = "Или войдите с помощью",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 180.dp, bottom = 20.dp),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            color = Color(0xFF939396)
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight()
                .padding(bottom = 75.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF),
                disabledContentColor = Color(0xFFC9D4FB)
            ),
            border = BorderStroke(3.dp, Color.LightGray)
        ){
            Text(
                text = "Войти с Яндекс",
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
}

