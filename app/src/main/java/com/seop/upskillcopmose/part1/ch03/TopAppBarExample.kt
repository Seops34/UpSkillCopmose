package com.seop.upskillcopmose.part1.ch03

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TopAppBar(
            title = {
                Text("TopAppBar")
            }
        )

        TopAppBar(
            title = {
                Text("TopAppBar")
            },
            navigationIcon = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "icon arrow back"
                    )
                }
            }
        )

        TopAppBar(
            title = {
                Text("TopAppBar")
            },
            navigationIcon = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "icon arrow back"
                    )
                }
            },
            actions = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "icon search"
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "icon settings"
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.AccountBox,
                        contentDescription = "icon account box"
                    )
                }
            }
        )

//        TopAppBar {
//            IconButton(
//                onClick = {}
//            ) {
//                Icon(
//                    imageVector = Icons.Filled.AccountBox,
//                    contentDescription = "icon account box"
//                )
//            },
//            Text("TopAppBar")
//        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewTopAppBarExample() {
    TopAppBarExample()
}