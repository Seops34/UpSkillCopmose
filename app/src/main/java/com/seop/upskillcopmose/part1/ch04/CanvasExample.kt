package com.seop.upskillcopmose.part1.ch04

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CanvasExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Canvas(
            modifier = Modifier.size(20.dp)
        ) {
            drawLine(Color.Red, Offset(30f, 10f), Offset(50f, 40f))

            drawCircle(Color.Yellow, 10f, Offset(15f, 40f))

            drawArc(Color.Magenta, startAngle = 0f, sweepAngle = 90f, useCenter = false)


//            moveTo(2.01f, 21.0f)
//            lineTo(23.0f, 12.0f)
//            lineTo(2.01f, 3.0f)
//            lineTo(2.0f, 10.0f)
//            lineToRelative(15.0f, 2.0f)
//            lineToRelative(-15.0f, 2.0f)

            drawLine(Color.Green, Offset(2.01f, 21.0f), Offset(23.0f, 12.0f))
            drawLine(Color.Green, Offset(23.0f, 12.0f), Offset(2.01f, 3.0f))
            drawLine(Color.Green, Offset(2.01f, 3.0f), Offset(2.0f, 10.0f))
            drawLine(Color.Green, Offset(2.0f, 10.0f), Offset(17.0f, 12.0f))
            drawLine(Color.Green, Offset(17.0f, 12.0f), Offset(2.0f, 14.0f))
            drawLine(Color.Green, Offset(2.0f, 14.0f), Offset(2.01f, 21.0f))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCanvasExample() {
    CanvasExample()
}