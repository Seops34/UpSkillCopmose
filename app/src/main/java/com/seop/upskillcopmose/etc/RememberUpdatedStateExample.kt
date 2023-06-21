package com.seop.upskillcopmose.etc

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedStateExample() {
    val context = LocalContext.current
    var count by remember { mutableStateOf(0) }

    Column {
        Button(
            onClick = { count++ }
        ) {
            Text(text = "recomposition")
        }

        LandingScreen {
            count++
            Toast.makeText(context, "trigger + ${count}", Toast.LENGTH_SHORT).show()
        }
    }
}

@Composable
private fun LandingScreen(
    onTimeOut: () -> Unit
) {
    val currentOnTimeOut by rememberUpdatedState(onTimeOut)
    Log.d("seop", "check : ${currentOnTimeOut}")
    LaunchedEffect(true) {
        delay(1000)
        currentOnTimeOut()
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewRememberUpdatedStateExample() {
    RememberUpdatedStateExample()
}