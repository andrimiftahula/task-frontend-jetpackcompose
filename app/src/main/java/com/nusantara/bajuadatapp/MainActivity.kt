package com.nusantara.bajuadatapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nusantara.bajuadatapp.data.DummyData
import com.nusantara.bajuadatapp.presentation.BajuAdatApp
import com.nusantara.bajuadatapp.ui.theme.BajuAdatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BajuAdatAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BajuAdatApp(k_Bajuadat = DummyData.mobileKbajuAdat, b_BajuAdat = DummyData.mobileBBajuAdat)
                }
            }
        }
    }
}
