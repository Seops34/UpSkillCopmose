package com.seop.upskillcopmose.ch03

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seop.upskillcopmose.ui.theme.UpSkillCopmoseTheme

@Composable
fun SurfaceExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Surface(
            modifier = Modifier.padding(5.dp)
        ) {
            Text(
                text = "Hello",
                modifier = Modifier.padding(5.dp)
            )
        }

        Surface(
            modifier = Modifier.padding(5.dp),
            shadowElevation = 10.dp
        ) {
            Text(
                text = "Hello",
                modifier = Modifier.padding(5.dp)
            )
        }

        Surface(
            modifier = Modifier.padding(5.dp),
            shadowElevation = 10.dp,
            border = BorderStroke(
                width = 2.dp,
                color = Color.Magenta
            )
        ) {
            Text(
                text = "Hello",
                modifier = Modifier.padding(5.dp)
            )
        }

        Surface(
            modifier = Modifier.padding(5.dp),
            shadowElevation = 10.dp,
            border = BorderStroke(
                width = 2.dp,
                color = Color.Magenta
            ),
            shape = CircleShape
        ) {
            Text(
                text = "Hello",
                modifier = Modifier.padding(5.dp)
            )
        }

        Surface(
            modifier = Modifier.padding(5.dp),
            shadowElevation = 10.dp,
            border = BorderStroke(
                width = 2.dp,
                color = Color.Magenta
            ),
            shape = CircleShape,
            color = MaterialTheme.colorScheme.primary
        ) {
            Text(
                text = "Hello",
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSurfaceExample() {
    SurfaceExample()
}