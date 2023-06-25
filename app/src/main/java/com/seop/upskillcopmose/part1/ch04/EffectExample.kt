package com.seop.upskillcopmose.ch04

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EffectExample(
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current
) {
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(snackbarHostState) {
        snackbarHostState.showSnackbar("Hello compose")
    }

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            // SAM : Single Abstract method
            when (event) {
                Lifecycle.Event.ON_START -> {
                    Log.d("seop", "ON_START")
                }
                Lifecycle.Event.ON_STOP -> {
                    Log.d("seop", "ON_STOP")
                }
                else -> {
                    Log.d("seop", "OTHER")
                }
            }
        }

        Log.d("seop", "add observer")
        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            Log.d("seop", "remove observer")
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {

        }
    }
}

@Preview
@Composable
private fun PreviewEffectExample() {
    EffectExample()
}