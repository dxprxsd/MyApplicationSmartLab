package com.example.myapplicationkuzminsmartlab

import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import com.example.myapplicationkuzminsmartlab.Screens.CodeScreen
import com.example.myapplicationkuzminsmartlab.Screens.SmartLabFirstScreen
import com.example.myapplicationkuzminsmartlab.Screens.EmailScreen
import com.example.myapplicationkuzminsmartlab.Screens.FirstBootScreen
import com.example.myapplicationkuzminsmartlab.Screens.SecondBootScreen
import com.example.myapplicationkuzminsmartlab.Screens.ThirdBootScreen


@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "firstScreen")
    {
        composable("firstScreen"){
            SmartLabFirstScreen(navController)
        }
        composable("firstBootScr"){
            FirstBootScreen(navController)
        }
        composable("secondBootScr"){
            SecondBootScreen(navController)
        }
        composable("thirdBootScr"){
            ThirdBootScreen(navController)
        }
        composable("LogScreen"){
            EmailScreen(navController)
        }
        composable("EnterCodeScreen"){
            CodeScreen(navController)
        }
        composable("LogScreen"){
            EmailScreen(navController)
        }
    }
}



