package com.seop.upskillcopmose.ch04

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun BarrierExample() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (redBox, yellowBox, magentaBox, text) = createRefs()

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Red)
                .constrainAs(redBox) {
                    top.linkTo(parent.top, margin = 18.dp)
                }
        )

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Yellow)
                .constrainAs(yellowBox) {
                    top.linkTo(parent.top, margin = 32.dp)
                }
        )

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Magenta)
                .constrainAs(magentaBox) {
                    top.linkTo(parent.top, margin = 20.dp)
                }
        )

//        createVerticalChain(redBox, yellowBox, magentaBox)
//        createHorizontalChain(redBox, yellowBox, magentaBox)

//        createHorizontalChain(redBox, yellowBox, magentaBox, chainStyle = ChainStyle.Spread)
//        createHorizontalChain(redBox, yellowBox, magentaBox, chainStyle = ChainStyle.Packed)
        createHorizontalChain(redBox, yellowBox, magentaBox, chainStyle = ChainStyle.SpreadInside)

        val barrier = createBottomBarrier(redBox, yellowBox, magentaBox)
        Text(
            text = "Hello this is seop.",
            modifier = Modifier.constrainAs(text) {
                top.linkTo(barrier)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBarrierExample() {
    BarrierExample()
}