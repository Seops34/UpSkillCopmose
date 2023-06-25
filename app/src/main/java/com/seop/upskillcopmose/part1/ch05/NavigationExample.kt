package com.seop.upskillcopmose.ch05

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationExample(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = "Home",
        modifier = modifier
    ) {
        composable("Home") {
            Column {
                Text("Home")
                Button(
                    onClick = {
                        navController.navigate("Office")
                    }
                ) {
                    Text("Office로 이동")
                }
                Button(
                    onClick = {
                        navController.navigate("Home") {
                            launchSingleTop = true
                        }
                    }
                ) {
                    Text("Home으로 이동")
                }
                Button(
                    onClick = {
                        val items = listOf("A", "B", "C")
                        navController.navigate("Argument/${items}") {
                            launchSingleTop = true
                        }
                    }
                ) {
                    Text("Argument로 이동")
                }
            }
        }

        composable("Office") {
            Column {
                Text("Office")
                Button(
                    onClick = {
                        navController.navigate("Playground")
                    }
                ) {
                    Text("Playground으로 이동")
                }
            }
        }

        composable("Playground") {
            Column {
                Text("Office")
                Button(
                    onClick = {
                        navController.navigate("Office")
                    }
                ) {
                    Text("Office로 이동")
                }

                Text("Home")
                Button(
                    onClick = {
                        navController.navigate("Home") {
                            popUpTo("Home") {
                                inclusive = true
                            }
                            /**
                             *  inclusive는 언제 사용?
                             *   Home -> Login -> Mail
                             *   popUpTo("Login") { inclusive = true }
                             *
                             *   Home -> Mail
                             */
                        }
                    }
                ) {
                    Text("Home으로 이동")
                }
            }
        }

        composable(
            route = "Argument/{items}",
        ) {
            val items = it.arguments?.getStringArray("items")
            Text("userId : ${items}")
        }
    }
}

@Preview
@Composable
private fun PreviewNavigationExample() {
    NavigationExample()
}