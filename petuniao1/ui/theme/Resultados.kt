package com.example.petuniao1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.petuniao1.R
import kotlinx.coroutines.delay

@Composable
fun Resultado(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(3000L)
        navController.navigate("Home")
    }

    val gato = GatoEscolhido.gato
    if (gato == null) {
        Text("Nenhum gato selecionado")
        return
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = "Fundo rosa/lilás",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.rectangle_6_fundo_escolhido_),
            contentDescription = "Imagem a cima de rosa/lilas na cor de ciano",
            modifier = Modifier
                .align(Alignment.Center)
                .width(352.dp)
                .height(841.dp)
        )
        Image(
            //pixelart
            painter = painterResource(id = gato.pixelart),
            contentDescription = "Um gato de cor frajona em formato de pixel art",
            modifier = Modifier
                .align(Alignment.Center)
                .width(110.dp)
                .height(110.dp)
                .offset(y = 360.dp)

        )
        Image(
            //imagem do gato
            painter = painterResource(id = gato.imagem1),
            contentDescription = "foto real de um gato frajola chamado jack",
            modifier = Modifier
                .align(Alignment.Center)
                .width(318.dp)
                .height(332.dp)
                //ele vai pra cima
                .offset(y = (-15).dp)

        )
        Image(
            painter = painterResource(id = R.drawable.patinha_sem_sombra),
            contentDescription = "Uma pequena imagem de um desenho de patinha felina na cor ciano",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .width(69.dp)
                .height(69.dp)
                .offset(y = 125.dp)
        )
        Text(
            //nome do gato
            text = gato.gato1,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontebonitinha,
            fontWeight = FontWeight.Medium,

            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 215.dp)
                .offset(y = (-30).dp)


        )
        Text(
            text = "MeowMe",
            fontSize = 33.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontebonitinha,

            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 73.dp)
        )
        Text(
            text = "O pet escolhido foi:",
            fontSize = 27.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontebonitinha,

            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 215.dp)
        )
        Text(
            //descrição deles de acordo com a escolha
            text = gato.escolha,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontebonitinha,

            modifier = Modifier
                .align(Alignment.BottomCenter)
                .offset(y = (-150).dp)
                .width(280.dp)
        )

    }
}