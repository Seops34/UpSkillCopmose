package com.seop.upskillcopmose.part1.ch03

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ModifierExample() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Button(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text("Search")
            }

//        Button(
//            onClick = {},
//            modifier = Modifier.fillMaxSize()
//        ) {
//            Icon(
//                imageVector = Icons.Filled.Search,
//                contentDescription = null
//            )
//            Spacer(
//                modifier = Modifier.width(ButtonDefaults.IconSpacing)
//            )
//            Text("Search")
//        }

            Button(
                onClick = {},
                modifier = Modifier.height(100.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text("Search")
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text("Search")
            }

            Button(
                onClick = {},
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text("Search")
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .background(Color.Red)
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text("Search")
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text("Search")
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text("Search")
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.Black
                ),
                enabled = false
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text(
                    "Search",
                    modifier = Modifier.clickable {  }
                )
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.Black
                ),
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
                Spacer(
                    modifier = Modifier.width(ButtonDefaults.IconSpacing)
                )
                Text(
                    "Search",
                    modifier = Modifier.offset(x = 10.dp, y = (-30).dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewModifierExample() {
    ModifierExample()
}