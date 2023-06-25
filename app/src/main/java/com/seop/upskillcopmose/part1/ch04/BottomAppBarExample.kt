package com.seop.upskillcopmose.ch04

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBarExample() {
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    var count by remember { mutableStateOf(0) }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        bottomBar = {
            BottomAppBar {
                Button(
                    onClick = {
                        count++
                        coroutineScope.launch {
                            snackbarHostState.showSnackbar(
                                message = "show snackbar",
                                duration = SnackbarDuration.Short
                            )
                        }
                    }
                ) {
                    Text(text = "Snackbar")
                }
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Text(
                text = "현재 count 값은 ${count}입니다.",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewBottomAppBarExample() {
    BottomAppBarExample()
}