package com.seop.upskillcopmose.ch03

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldExample() {
    var name by remember { mutableStateOf("Seop") }

    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
//        TextField(
//            value = name,
//            label = {
//                Text("이름")
//            },
//            onValueChange = {
//                name = it
//            }
//        )

        OutlinedTextField(
            value = name,
            label = {
                Text("이름")
            },
            onValueChange = {
                name = it
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Hello ${name}"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewTextFieldExample() {
    TextFieldExample()
}