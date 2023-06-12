package com.seop.upskillcopmose.ch03

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row {
            Text(text = "A")
            Text(text = "B")
            Text(text = "C")
        }

        Row(
            modifier = Modifier.height(50.dp)
        ) {
            Text(
                text = "A",
                modifier = Modifier.align(Alignment.Top)
            )
            Text(
                text = "B",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Text(
                text = "C",
                modifier = Modifier.align(Alignment.Bottom)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "A",
                modifier = Modifier.background(Color.Yellow)
            )
            Text(
                text = "B",
                modifier = Modifier.background(Color.Blue)
            )
            Text(
                text = "C",
                modifier = Modifier.background(Color.Green)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "A",
                modifier = Modifier.background(Color.Yellow)
            )
            Text(
                text = "B",
                modifier = Modifier.background(Color.Blue)
            )
            Text(
                text = "C",
                modifier = Modifier.background(Color.Green)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "A",
                modifier = Modifier.background(Color.Yellow)
            )
            Text(
                text = "B",
                modifier = Modifier.background(Color.Blue)
            )
            Text(
                text = "C",
                modifier = Modifier.background(Color.Green)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "A",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Yellow)
            )
            Text(
                text = "B",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Blue)
            )
            Text(
                text = "C",
                modifier = Modifier
                    .weight(2f)
                    .background(Color.Green)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRowExample() {
    RowExample()
}