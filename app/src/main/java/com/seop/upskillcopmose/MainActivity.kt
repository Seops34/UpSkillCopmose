package com.seop.upskillcopmose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.seop.upskillcopmose.ch04.EffectExample
import com.seop.upskillcopmose.ui.theme.UpSkillCopmoseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UpSkillCopmoseTheme {
                var isVisible by remember { mutableStateOf(false) }

                Column {
                    Button(
                        onClick = { isVisible = !isVisible}
                    ) {
                        Text(text = "button")
                    }

                    if (isVisible) {
                        EffectExample()
                    }
                }
            }
        }
    }
}