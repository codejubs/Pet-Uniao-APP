package com.example.petuniao1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.petuniao1.R
import java.nio.file.WatchEvent

@Composable
fun Homeconteudo(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo_tela_inicio),
            contentDescription = "Home",
            modifier = Modifier.fillMaxSize(),
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
            contentDescription = "caixa texto na cor verde agua",
            modifier = Modifier
                .width(316.dp)
                .height(109.dp)
                .align(Alignment.Center)
                .offset(y = 55.dp)
        )
        Box (
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 20.dp)
        )
        {
            Text(
                text = "Qual gato combina com você?",
                fontSize = 30.sp,
                lineHeight = 29.sp,
                fontFamily = fontebonitinha,

                modifier = Modifier
                    .padding(5.dp)
                    .offset(y = 440.dp)
                    .fillMaxHeight()
                    .width(264.dp)
                    .height(71.dp),
                textAlign = TextAlign.Center
            )
        }


        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 155.dp)
                //tenho q por sombra no botão

        ) {
            Botaocomezar("Começar"){
                navController.navigate("Escolhas")//quando clicar ele vai navegar para a tela escolhas

            }
        }

    }
}

//criação de um botão
@Composable
fun Botaocomezar(text: String, onClick: () -> Unit = {})
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(vertical = 8.dp)
    ) {
        Spacer(modifier = Modifier.width(100.dp))

        // Botão com clique somente aqui
        Box(
            modifier = Modifier
                .height(60.dp)
                .width(220.dp)
                .clickable(onClick = onClick)
                .background(color = Miar40, RoundedCornerShape(50)),//deixar o botão clicavel
                contentAlignment = Alignment.Center
        ) {
            Text(
                text = texto,
                fontFamily = fontebonitinha,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
fun Botaoprox(text: String, onClick: () -> Unit = {})
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(vertical = 8.dp)
    ) {
        Spacer(modifier = Modifier.width(100.dp))

        // Botão com clique somente aqui
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(250.dp)
                .clickable(onClick = onClick)
                .background(color = Miar40, RoundedCornerShape(50)),//deixar o botão clicavel
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = texto,
                fontFamily = fontebonitinha,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 23.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}




