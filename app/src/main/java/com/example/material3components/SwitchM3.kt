package com.example.material3components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun SwitchM3() {

    var isChecked by remember { mutableStateOf(false) }

    val icons = if (isChecked) Icons.Filled.Check else Icons.Filled.Close

    val icon: (@Composable () -> Unit)? = if (isChecked) {
        {
            Icon(
                imageVector = Icons.Filled.Check,
                contentDescription = null,
                modifier = Modifier.size(SwitchDefaults.IconSize)
            )
        }
    } else null

    Switch(
        checked = isChecked,
        onCheckedChange = { isChecked = it },
        thumbContent = icon
    )
}