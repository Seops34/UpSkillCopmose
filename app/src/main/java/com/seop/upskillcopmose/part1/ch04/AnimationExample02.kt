package com.seop.upskillcopmose.ch04

import androidx.compose.animation.Crossfade
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
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
fun AnimationExample02() {
    var isDarkMode by remember { mutableStateOf(false) }

    val transition = updateTransition(
        targetState = isDarkMode,
        label = "Transition with isDarkMode"
    )

    val backgroundColor by transition.animateColor(label = "Background color animation") { state ->
        if (state) Color.Black else Color.White
    }

    val textColor by transition.animateColor(label = "Text color animation") { state ->
        if (state) Color.White else Color.Black
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        RadioButtonWithText(
            text = "일반 모드",
            textColor = textColor,
            isSelected = !isDarkMode,
        ) {
            isDarkMode = false
        }

        RadioButtonWithText(
            text = "다크 모드",
            textColor = textColor,
            isSelected = isDarkMode,
        ) {
            isDarkMode = true
        }

        Crossfade(
            targetState = isDarkMode
        ) { state ->
            if (state) {
                Row {
                    Box(modifier = Modifier.size(30.dp).background(Color.Red))
                    Box(modifier = Modifier.size(30.dp).background(Color.Blue))
                    Box(modifier = Modifier.size(30.dp).background(Color.Green))
                }
            } else {
                Column {
                    Box(modifier = Modifier.size(30.dp).background(Color.Red))
                    Box(modifier = Modifier.size(30.dp).background(Color.Blue))
                    Box(modifier = Modifier.size(30.dp).background(Color.Green))
                }
            }
        }
    }
}

@Composable
private fun RadioButtonWithText(
    text: String,
    textColor: Color,
    isSelected: Boolean = false,
    onSelect: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .selectable(
                selected = isSelected,
                onClick = onSelect
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = isSelected,
            onClick = onSelect
        )
        Text(
            text = text,
            color = textColor
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAnimatedExample02() {
    AnimationExample02()
}