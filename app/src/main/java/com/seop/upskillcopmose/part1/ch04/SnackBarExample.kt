package com.seop.upskillcopmose.part1.ch04

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnackBarExample() {
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    var count by remember { mutableStateOf(0) }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {

        }
        Button(
            onClick = {
                count++
                coroutineScope.launch {
                    val result = snackbarHostState.showSnackbar(
                        message = "안녕하세요 ${count}입니다.",
                        actionLabel = "dismiss",
                        duration = SnackbarDuration.Short
                    )

                    when (result) {
                        SnackbarResult.Dismissed -> {

                        }
                        SnackbarResult.ActionPerformed -> {

                        }
                    }
                }
            }
        ) {
            Text(text = "Snackbar")
        }
    }
}

@Preview
@Composable
private fun PreviewSnackBarExample() {
    SnackBarExample()
}