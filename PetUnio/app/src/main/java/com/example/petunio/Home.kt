package com.example.petunio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.googlefonts.GoogleFont
import java.nio.channels.spi.SelectorProvider.provider

val fonteGoogle = GoogleFont("Port Lligat Slab")
val fontFamily = FontFamily(
    Font(googleFont = fonteGoogle, fontProvider = provider())
)

@Preview
@Composable
fun Home() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo_tela_inicio),
            //necessita de uma descrição
            contentDescription = "Home",
            //para ficar em tamanho completo
            modifier = Modifier.fillMaxSize(),
            //corta a imagem para ficar certo
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.ellipse_2),
            contentDescription = "Circulo",
            modifier = Modifier
                .width(199.dp)
                .height(199.dp)
                .offset(x = 106.dp, y = 195.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.gatosombra),
            contentDescription = "gato sombra",
            modifier = Modifier
                .width(113.dp)
                .height(111.dp)
                .offset(x = 150.dp, y = 239.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.rectangle_6),
            contentDescription = "caixa texto",
            modifier = Modifier
                .width(316.dp)
                .height(109.dp)
                .offset(x = 50.dp, y = 448.dp)
        )

    }
}