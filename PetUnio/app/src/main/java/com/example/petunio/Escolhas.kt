package com.example.petunio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Escolhas(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = "retangulo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Image(

            painter = painterResource(id = R.drawable.rectangle_7),
            contentDescription = "Fundo da imagem dos gatos",
            modifier = modifier
                .width(352.dp)
                .height(400.dp)
                .offset(x = 29.dp, y = 59.dp) //x e y

        )
    }
}




