package com.seop.upskillcopmose.ch03

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        val context = LocalContext.current

        Button(
            onClick = {}
        ) {
            Text(text = "Send")
        }

        Button(
            onClick = {
                Toast.makeText(context, "send clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text = "Send")
        }

        Button(
            onClick = {
                Toast.makeText(context, "send clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = ""
            )
            Text(text = "Send")
        }

        Button(
            onClick = {
                Toast.makeText(context, "send clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
            Text(text = "Send")
        }

        Button(
            onClick = {},
            enabled = false
        ) {
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
            Text(text = "Send")
        }

        Button(
            onClick = {},
            enabled = true,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
            Text(text = "Send")
        }

        Button(
            onClick = {},
            enabled = true,
            border = BorderStroke(1.dp, Color.Black),
            shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
            Text(text = "Send")
        }

        Button(
            onClick = {},
            enabled = true,
            border = BorderStroke(1.dp, Color.Black),
            shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
            contentPadding = PaddingValues(20.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
            Text(text = "Send")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewButtonExample() {
    ButtonExample()
}