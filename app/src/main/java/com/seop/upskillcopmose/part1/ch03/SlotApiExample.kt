package com.seop.upskillcopmose.part1.ch03

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SlotApiExample() {
    var isChecked1 by remember { mutableStateOf(false) }
    var isChecked2 by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        CheckboxWithSlot(
            isChecked = isChecked1,
            onCheckedChange = { isChecked1 = !isChecked1}
        ) {
            Text(text = "text 1")
        }
        CheckboxWithSlot(
            isChecked = isChecked2,
            onCheckedChange = { isChecked2 = !isChecked2}
        ) {
            Text(text = "text 2")
        }
    }
}

@Composable
fun CheckboxWithSlot(
    isChecked: Boolean,
    onCheckedChange: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = Modifier.clickable {
            onCheckedChange()
        },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { onCheckedChange() }
        )
        content()
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSlotApiExample() {
    SlotApiExample()
}