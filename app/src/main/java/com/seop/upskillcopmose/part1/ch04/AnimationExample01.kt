package com.seop.upskillcopmose.ch04

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AnimationExample01() {
    var isVisible by remember { mutableStateOf(false) }
    var isColored by remember { mutableStateOf(false) }

    val backgroundColorState by animateColorAsState(
        targetValue = if (isColored) Color.Green else Color.White
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColorState),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        AnimatedVisibility(
            visible = isVisible,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Text(
                text = "Hello world"
            )
        }

        Row(
            modifier = Modifier.selectable(
                selected = isVisible,
                onClick = {
                    isVisible = true
                }
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = isVisible,
                onClick = {
                    isVisible = true
                }
            )
            Text(
                text = "Visible"
            )
        }
        Row(
            modifier = Modifier.selectable(
                selected = !isVisible,
                onClick = {
                    isVisible = false
                }
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = !isVisible,
                onClick = {
                    isVisible = false
                }
            )
            Text(
                text = "Invisible"
            )
        }

        Row(
            modifier = Modifier.selectable(
                selected = isColored,
                onClick = {
                    isColored = true
                }
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = isColored,
                onClick = {
                    isColored = true
                }
            )
            Text(
                text = "Colored"
            )
        }
        Row(
            modifier = Modifier.selectable(
                selected = !isColored,
                onClick = {
                    isColored = false
                }
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = !isColored,
                onClick = {
                    isColored = false
                }
            )
            Text(
                text = "UnColored"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAnimationExample01() {
    AnimationExample01()
}