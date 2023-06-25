package com.seop.upskillcopmose.ch03

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seop.upskillcopmose.R

@Composable
fun ImageExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "안드로이드 아이콘"
        )

        Image(
            imageVector = Icons.Filled.Email,
            contentDescription = "이메일 아이콘"
        )

//        Image(
//            bitmap = "",
//            contentDescription = "이메일 아이콘"
//        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewImageExample() {
    ImageExample()
}