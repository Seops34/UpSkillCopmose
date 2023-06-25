package com.seop.upskillcopmose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(

): ViewModel() {

    var isDialogEnabled by mutableStateOf(false)
        private set

    fun showDialog() {
        isDialogEnabled = true
    }

    fun hideDialog() {
        isDialogEnabled = false
    }
}