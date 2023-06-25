package com.seop.upskillcopmose.part1.ch04

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DropDownMenuExample() {
    var isDropDownMenuEnabled by remember { mutableStateOf(false) }
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                isDropDownMenuEnabled = true
            }
        ) {
            Text("DropDownMenu")
        }

        Text(text = "${count}")

        DropdownMenu(
            expanded = isDropDownMenuEnabled,
            onDismissRequest = {
                isDropDownMenuEnabled = false
            }
        ) {
            DropdownMenuItem(
                text = {
                    Text(text = "증가")
                },
                onClick = {
                    count++
                    isDropDownMenuEnabled = false
                },
            )
            DropdownMenuItem(
                text = {
                    Text(text = "감소")
                },
                onClick = {
                    count--
                    isDropDownMenuEnabled = false
                },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDropDownMenuExample() {
    DropDownMenuExample()
}