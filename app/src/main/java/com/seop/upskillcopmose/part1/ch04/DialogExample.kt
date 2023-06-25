package com.seop.upskillcopmose.ch04

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DialogExample() {
    var isDialogEnabled by remember { mutableStateOf(false) }
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                isDialogEnabled = true
            }
        ) {
            Text(text = "Dialog")
        }

        Text(text = "${count}")
    }

    if (isDialogEnabled) {
        AlertDialog(
            onDismissRequest = {
                isDialogEnabled = false
            },
            confirmButton = {
                Button(
                    onClick = {
                        isDialogEnabled = false
                        count++
                    }
                ) {
                    Text(text = "더하기")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        isDialogEnabled = false
                    }
                ) {
                    Text(text = "취소")
                }
            },
            title = {
                Text(text = "더하기")
            },
            text = {
                Text(text = "값을 더할 수 있습니다.")
            },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDialogExample() {
    DialogExample()
}