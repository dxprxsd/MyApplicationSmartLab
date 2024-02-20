package com.example.myapplicationkuzminsmartlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.myapplicationkuzminsmartlab.ui.theme.MyApplicationKuzminSmartLabTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationKuzminSmartLabTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ){
                    Navigation()
                }

            }

        }
    }
}
