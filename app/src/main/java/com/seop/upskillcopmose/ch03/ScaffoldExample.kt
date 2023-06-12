package com.seop.upskillcopmose.ch03

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    var isChecked by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                     IconButton(onClick = {}) {
                         Icon(
                             imageVector = Icons.Filled.ArrowBack,
                             contentDescription = "icon arrow back"
                         )
                     }
                },
                title = {
                    Text(text = "Scaffold App")
                }
            )
        }
    ) {
        Surface(
            modifier = Modifier.padding(it)
        ) {
            CheckboxWithSlot(
                isChecked = isChecked,
                onCheckedChange = { isChecked = !isChecked }
            ) {
                Text(
                    text = "체크 박스입니다."
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewScaffoldExample() {
    ScaffoldExample()
}