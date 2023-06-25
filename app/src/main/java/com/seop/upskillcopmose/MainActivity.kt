package com.seop.upskillcopmose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.hilt.navigation.compose.hiltViewModel
import com.seop.upskillcopmose.ui.theme.UpSkillCopmoseTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UpSkillCopmoseTheme {
                DialogScreen()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DialogScreen(
    vm: MainViewModel = hiltViewModel()
) {
    Scaffold {
        Column(
            modifier = Modifier.padding(it)
        ) {

            if (vm.isDialogEnabled) {
                Dialog(
                    onDismissRequest = {
                        vm.hideDialog()
                    }
                ) {
                    Text(text = "Dialog Test")
                }
            }

            Button(
                onClick = {
                    vm.showDialog()
                }
            ) {
                Text(text = "Show Dialog")
            }
        }
    }
}