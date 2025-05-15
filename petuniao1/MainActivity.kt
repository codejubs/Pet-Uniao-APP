package com.example.petuniao1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.petuniao1.ui.theme.Escolhas
import com.example.petuniao1.ui.theme.Homeconteudo
import com.example.petuniao1.ui.theme.Petuniao1Theme
import com.example.petuniao1.ui.theme.Resultado
import com.example.petuniao1.ui.theme.SplashConteudo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Petuniao1Theme {
                val navController = rememberNavController()
                NavHost(navController,
                    startDestination = "Splash")
                {
                    composable("Splash"){
                     SplashConteudo {
                         //ele chama essa função
                         navController.navigate("Home") // pra onde ela ira dps da splash
                         {
                             popUpTo("Splash") {
                                 inclusive = true
                             }
                         }
                     }
                   }
                    composable("Home"){
                        Homeconteudo(navController)
                    }
                    composable("escolhas"){
                        Escolhas(navController)
                    }
                    composable("Escolhido"){
                        Resultado(navController)
                    }

                }

            }
        }
    }
}

