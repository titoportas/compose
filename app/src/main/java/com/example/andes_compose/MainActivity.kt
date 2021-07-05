package com.example.andes_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.andes_compose.ui.theme.AndescomposeTheme
import com.titoportas.ui_compose.badge.ComposableBadgeDotPreview
import com.titoportas.ui_compose.badge.ComposeBadgeDot
import com.titoportas.ui_compose.badge.type.AndesBadgeType

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndescomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
                    ComposeBadgeDot(AndesBadgeType.ERROR)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndescomposeTheme {
        Column(Modifier.fillMaxWidth()) {
            ComposeBadgeDot(AndesBadgeType.ERROR)
            Spacer(modifier = Modifier.height(4.dp))
            ComposeBadgeDot(AndesBadgeType.WARNING)
            Spacer(modifier = Modifier.height(4.dp))
            ComposeBadgeDot(AndesBadgeType.HIGHLIGHT)
            Spacer(modifier = Modifier.height(4.dp))
            ComposeBadgeDot(AndesBadgeType.NEUTRAL)
            Spacer(modifier = Modifier.height(4.dp))
            ComposeBadgeDot(AndesBadgeType.SUCCESS)
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}