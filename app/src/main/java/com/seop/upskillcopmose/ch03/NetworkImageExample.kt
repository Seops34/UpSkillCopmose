package com.seop.upskillcopmose.ch03

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter

@Composable
fun NetworkImageExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        val painter = rememberImagePainter(data = "")
        Image(
            painter = painter,
            contentDescription = "rememberImagePainter test"
        )

        AsyncImage(
            model = "",
            contentDescription = "AsyncImage Test"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewNetworkImageExample() {
    NetworkImageExample()
}