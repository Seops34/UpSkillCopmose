package com.seop.upskillcopmose.ch04

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog

@Composable
fun CustomDialogExample() {
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
            Text("Open")
        }

        Text(text = "${count}")
    }

    if (isDialogEnabled) {
        Dialog(
            onDismissRequest = {
                isDialogEnabled = false
            }
        ) {
            Surface {
                Column {
                    Text(text = "Dialog open")

                    Row {
                        Button(
                            onClick = {
                                isDialogEnabled = false
                            }
                        ) {
                            Text("취소")
                        }
                        Button(
                            onClick = {
                                count++
                                isDialogEnabled = false
                            }
                        ) {
                            Text("+1 증가")
                        }
                        Button(
                            onClick = {
                                count--
                                isDialogEnabled = false
                            }
                        ) {
                            Text("-1 증가")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCustomDialogExample() {
    CustomDialogExample()
}