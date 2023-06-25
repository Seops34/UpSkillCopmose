package com.seop.upskillcopmose.part1.ch04

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {
            val (redBox, magentaBox, greenBox, yellowBox) = createRefs()

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Red)
                    .constrainAs(redBox) {
                        bottom.linkTo(parent.bottom, margin = 8.dp)
                        end.linkTo(parent.end, margin = 4.dp)
                    }
            )

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Magenta)
                    .constrainAs(magentaBox) {
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Green)
                    .constrainAs(greenBox) {
                        centerTo(parent)
                    }
            )

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Yellow)
                    .constrainAs(yellowBox) {
                        top.linkTo(greenBox.bottom)
                        start.linkTo(greenBox.end)
                    }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewConstraintLayoutExample() {
    ConstraintLayoutExample()
}