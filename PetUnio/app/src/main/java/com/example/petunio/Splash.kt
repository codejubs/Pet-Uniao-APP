package com.example.petunio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun SplashConteudo() {
    //conteudo da splash
        Image(
            painter = painterResource(id = R.drawable.splash),
            //necessita de uma descrição
            contentDescription = "Splash",
            //para ficar em tamanho completo
            modifier = Modifier
                .width(412.dp)
                .height(917.dp)

        )
}

//fun de delay da splash
@Composable
fun Splash(navController: NavController){
    LaunchedEffect(Unit) {
        delay(3000) // 3 segundos
        navController.navigate("Home"){
            popUpTo("Splash") {inclusive = true}
        }
    }
    //ele linka com o conteudo da splash
    SplashConteudo()
}

//funcionamento
@Preview(showBackground = false)
@Composable
fun Splashteste(){
    SplashConteudo()
}