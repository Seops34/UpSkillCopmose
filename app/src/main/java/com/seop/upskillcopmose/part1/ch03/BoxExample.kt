package com.seop.upskillcopmose.part1.ch03

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(
            modifier = Modifier.size(100.dp)
        ) {
            Text(
                text = "Hello world",
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Box(
            modifier = Modifier.size(100.dp)
        ) {
            Text(
                text = "Hello world",
                modifier = Modifier.align(Alignment.BottomCenter)
            )
            Text(
                text = "jetpack",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }

        Box(
            modifier = Modifier.size(100.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(Color.Gray)
                    .align(Alignment.TopStart)
            )

            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(Color.Yellow)
                    .align(Alignment.BottomEnd)
            )
        }

        Box {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
                    .align(Alignment.TopStart)
            )

            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(Color.Yellow)
                    .align(Alignment.Center)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBoxExample() {
    BoxExample()
}