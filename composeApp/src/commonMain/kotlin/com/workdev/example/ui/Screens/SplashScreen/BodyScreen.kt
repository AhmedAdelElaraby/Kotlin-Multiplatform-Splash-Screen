package com.workdev.example.ui.Screens.SplashScreen


 import androidx.compose.animation.core.RepeatMode
 import androidx.compose.animation.core.animateFloat
 import androidx.compose.animation.core.infiniteRepeatable
 import androidx.compose.animation.core.rememberInfiniteTransition
 import androidx.compose.animation.core.tween
 import androidx.compose.foundation.layout.Box
 import androidx.compose.foundation.layout.fillMaxSize
 import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
 import androidx.compose.runtime.getValue
 import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
 import androidx.compose.ui.draw.scale
 import androidx.compose.ui.graphics.Color
 import androidx.compose.ui.text.TextStyle
 import androidx.compose.ui.unit.sp

@Composable
fun BodyScreen(text: String){

    TextScreen(text)

}






@Composable
fun TextScreen(text:String){


    val scale= animation() // Animation

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            modifier  = Modifier.scale(scale),
            style = TextStyle(color = Color.Black),
            fontSize = 50.sp
        )
    }
}

