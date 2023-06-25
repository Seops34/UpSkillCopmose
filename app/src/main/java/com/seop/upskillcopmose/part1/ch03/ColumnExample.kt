package com.seop.upskillcopmose.part1.ch03

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Column {
            Text(text = "A")
            Text(text = "B")
            Text(text = "C")
        }

        Column(
            modifier = Modifier.width(100.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(text = "A")
            Text(text = "B")
            Text(text = "C")
        }

        Column(
            modifier = Modifier.width(100.dp)
        ) {
            Text(
                text = "A",
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = "B",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "C",
                modifier = Modifier.align(Alignment.End)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewColumnExample() {
    ColumnExample()
}