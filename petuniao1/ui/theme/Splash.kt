package com.example.petuniao1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petuniao1.R
import kotlinx.coroutines.delay


@Composable
fun SplashConteudo(onTimeout: () -> Unit){
    LaunchedEffect(Unit) {
        delay(2000L)
        onTimeout() //para dar delay e ir pra home dps de 3 segundos
    }
    Image(
        painter = painterResource(id = R.drawable.splash2),
        contentDescription = "Splash",
        contentScale = ContentScale.Crop, //ele preenche a tela toda
        modifier = Modifier
            .fillMaxSize()
            .width(412.dp)
            .height(917.dp)
    )
}
