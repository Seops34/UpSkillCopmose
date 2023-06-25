package com.seop.upskillcopmose.ch05

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CompositionLocalExample() {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {

        Card(
            modifier = Modifier.padding(8.dp)
        ) {
            Text("안녕하세요. 패스트캠퍼스")
            Text("안녕하세요. 패스트캠퍼스")
            Text("안녕하세요. 패스트캠퍼스")
            CompositionLocalProvider(
                LocalContentColor provides Color.Magenta
            ) {
                Text("안녕하세요. 패스트캠퍼스")
            }
            Text("안녕하세요. 패스트캠퍼스")
            Text("안녕하세요. 패스트캠퍼스")
            Text("안녕하세요. 패스트캠퍼스")
        }

    }
}

@Preview
@Composable
private fun PreviewCompositionLocalExample() {
    CompositionLocalExample()
}