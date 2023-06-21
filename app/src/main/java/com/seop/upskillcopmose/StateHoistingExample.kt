package com.seop.upskillcopmose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StateHoistingExample() {
    Converter()
}

@Composable
private fun Converter() {
    var pyeong by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    ConverterStateless(
        pyeong = pyeong,
        result = result,
    ) {
        if (it.isBlank()) {
            pyeong = ""
            result = ""
            return@ConverterStateless
        }
        val pyeongToFloat = it.toFloatOrNull() ?: return@ConverterStateless
        pyeong = it
        result = (pyeongToFloat * 3.306).toString()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ConverterStateless(
    pyeong: String,
    result: String,
    onPyeongChanged: (String) -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        OutlinedTextField(
            value = pyeong,
            onValueChange = onPyeongChanged,
            label = {
                Text(text = "평")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        OutlinedTextField(
            value = result,
            onValueChange = {},
            label = {
                Text(text = "제곱미터")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewStateHoistingExample() {
    StateHoistingExample()
}