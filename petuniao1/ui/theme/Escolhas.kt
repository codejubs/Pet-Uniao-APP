package com.example.petuniao1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.petuniao1.R

//declarando dataclass pra ramdonizar
data class Gatin(
    val gato1: String,
    val descricao1: String,
    val imagem1: Int,
    val pixelart: Int,
    val escolha: String
)

//declarando a lista dos gatinhos com nome, descrição e foto
 val escolhagato = listOf(
     Gatin("Jack","Introvertido, prefere ficar no seu mundinho e em lugares calmos.",R.drawable.jack__gatinho1_,R.drawable.jackpixel,"Você é reservada(o) prefere está em sua própria compainha!"),
     Gatin("Luke","Anti-social, carente e gosta de dormir em lugares escuros.",R.drawable.luke__gatinho_2_,R.drawable.lukepixel,"Dormir no escuro é algo que você goste."),
     Gatin("Chantilly","Carinhosa, gosta de socializar e tomar um bom banho de sol.",R.drawable.chanchan__gatinho_3_,R.drawable.chanchanpixel,"Tomar banho de sol revitaliza a nossa vida."),
     Gatin("Nayu","Prefere lugares confortaveis para passar o tempo com si mesma.",R.drawable.nayu__gatinho_4_,R.drawable.nayupixel,"Passar tempo com si mesma as vezes é bom!"),
     Gatin("Akaashi","Adora conhecer novas pessoas e distribuir seu amor pelo mundo.",R.drawable.akaashi__gatinho_5_,R.drawable.akaashipixel,"As pessoas ao seu redor amam passar tempo com você!"),
     Gatin("Fred","Extrovertido, gosta de dormir, brincalhão e muito social.",R.drawable.fred__gatinho_6_,R.drawable.fredpixel,"Conhecer novas pessoas é realmente muito legal!"),
     Gatin("Yumi","Gosta de sair mas ao mesmo tempo é caseira. Ama tomar banho de sol.",R.drawable.mekocatframe,R.drawable.mekopixelart,"Ficar em casa realmente é muito bom!"),
     Gatin("Lobinho","Prefere está sempre sentado observando o ambiente.",R.drawable.lobinhocatframe,R.drawable.lobinhopixel_art,"Você é um otimo observador(a), está sempre atento a tudo!")

 )

//para guardar o gato como se fosse em uma outra dataclass, armazenando temporariamente o gato escolhido, como uma variavel global.
object GatoEscolhido{
    var gato: Gatin? = null
}

@Composable
fun Escolhas(navController: NavHostController) {

    //agr ele vai ficar aleatorio
    var random by remember{ mutableStateOf(escolhagato.random()) }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = "retangulo",//é como o talkback lê
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.rectangle_7),
            contentDescription = "Fundo da imagem dos gatos",
            modifier = Modifier
                .width(352.dp)
                .height(405.dp)
                .offset(x = 29.dp, y = 59.dp)
        )
        Image(
            //pra foto ficar aleatoria
            painter = painterResource(random.imagem1),
            contentDescription = random.gato1,
            modifier = Modifier
                .width(298.dp)
                .height(311.dp)
                .offset(x = 56.dp, y = 129.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.patinha),
            contentDescription = "imagem do primeiro gato",
            modifier = Modifier
                .width(52.dp)
                .height(52.dp)
                .offset(x = 45.dp, y = 104.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.patinha),
            contentDescription = "imagem do primeiro gato",
            modifier = Modifier
                .width(52.dp)
                .height(52.dp)
                .offset(x = 315.dp, y = 393.dp)
        )
        Text(
            text = "MeowMe",
            fontSize = 35.sp,
            lineHeight = 29.sp,
            fontFamily = fontebonitinha,
            textAlign = TextAlign.Center,

            modifier = Modifier
                .padding(5.dp)
                .offset(y = 74.dp)
                .fillMaxHeight()
                .width(300.dp)
                .height(39.dp)
                .align(Alignment.Center)
        )
        Text( //nome
            text = random.gato1,
            fontSize = 35.sp,
            lineHeight = 29.sp,
            fontFamily = fontebonitinha,
            //fica no meio de cria
            textAlign = TextAlign.Center,

            modifier = Modifier
                .padding(5.dp)
                .offset(y = 470.dp)
                .fillMaxHeight()
                .width(133.dp)
                .height(39.dp)
                .align(Alignment.Center)

        )
        Text( //descricao
            text = random.descricao1,
            fontSize = 30.sp,
            lineHeight = 29.sp,
            fontFamily = fontebonitinha,

            modifier = Modifier
                .align(Alignment.Center)
                .padding(5.dp)
                .offset(y = 520.dp)
                .fillMaxHeight()
                .width(340.dp)
                .height(113.dp),
           textAlign = TextAlign.Center



        )
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = 5.dp,y = 555.dp)
                .width(230.dp)
                .height(729.dp)
                //tenho q por sombra no botão
        ) {
            Botaocomezar("Escolher"){
                //eu puxei o objeto pra ele ser igual ao gatinrandom,puxando as informações do gatinho escolhido, guardando dentro do objeto
                GatoEscolhido.gato = random
                navController.navigate("Escolhido")//quando clicar ele vai navegar para a tela escolhas
            }

        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 630.dp)
                .width(170.dp)
                .height(729.dp)
                //tenho q por sombra no botão
        ) {
            Botaoprox("Próximo"){
               random = escolhagato.random()
            }

        }
    }

}



