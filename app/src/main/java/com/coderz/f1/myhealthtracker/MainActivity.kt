package com.coderz.f1.myhealthtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.coderz.f1.myhealthtracker.ui.theme.MyHealthTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyHealthTrackerTheme(window=window) {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    modifier=Modifier.fillMaxSize(),
                    topBar = {MHTAppBar()},
                    content={
                        MainContent()
                    }
                )
            }
        }
    }
}
