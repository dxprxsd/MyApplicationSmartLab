package com.example.myapplicationkuzminsmartlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplicationkuzminsmartlab.ui.theme.MyApplicationKuzminSmartLabTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplicationkuzminsmartlab.API.RepositoryImpl
import com.example.myapplicationkuzminsmartlab.API.RetrofitInstance
import com.example.myapplicationkuzminsmartlab.Screens.CodeScreen
import com.example.myapplicationkuzminsmartlab.Screens.FirstBootScreen
import com.example.myapplicationkuzminsmartlab.Screens.SmartLabFirstScreen
import com.example.myapplicationkuzminsmartlab.Screens.EmailScreen
import com.example.myapplicationkuzminsmartlab.ViewModel.ViewModelMain

class MainActivity : ComponentActivity() {
    private val viewModelSmart by viewModels<ViewModelMain>(factoryProducer = {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return ViewModelMain(RepositoryImpl(RetrofitInstance.apiSmartLab))
                        as T
            }
        }
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationKuzminSmartLabTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ){
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "greetingScreen"
                    )
                    {
                        composable("greetingScreen") {
                            SmartLabFirstScreen(navController)
                        }
                        composable("firstBootScreen") {
                            FirstBootScreen(navController)
                        }
                        composable("LogScreen") {
                            EmailScreen(navController, viewModelSmart)
                        }
                        composable("EnterCodeScreen") {
                            CodeScreen(navController)
                        }
                        composable("LogScreen") {
                            EmailScreen(navController, viewModelSmart)
                        }
                    }
                }

            }

        }
    }
}
