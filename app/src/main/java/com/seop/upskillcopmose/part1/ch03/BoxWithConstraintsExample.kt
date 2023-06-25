package com.seop.upskillcopmose.part1.ch03

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min

@Composable
fun BoxWithConstraintsExample() {
    Outer()
}

@Composable
private fun Outer() {
    Column {
        Inner(
            modifier = Modifier
                .widthIn(min = 100.dp)
                .heightIn(min = 150.dp)
        )
    }
}

@Composable
private fun Inner(
    modifier: Modifier = Modifier
) {
    BoxWithConstraints(
        modifier = modifier
    ) {
        if (maxHeight > 150.dp) {
            Text(
                text = "여기 꽤 길군요.",
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        }

        Text(
            text = "maxW : ${maxWidth} / maxH : ${maxHeight} / minW : ${minWidth} / minH : ${minHeight}"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBoxWithConstraintExample() {
    BoxWithConstraintsExample()
}