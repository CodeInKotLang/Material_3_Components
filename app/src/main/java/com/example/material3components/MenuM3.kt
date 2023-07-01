package com.example.material3components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MenusM3() {

    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.wrapContentSize()
    ) {
        IconButton(onClick = { expanded = true }) {
            Icon(Icons.Default.MoreVert, contentDescription = null)
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text(text = "Edit") },
                onClick = { /* Handle edit */ },
                leadingIcon = {
                    Icon(Icons.Default.Edit, contentDescription = null)
                }
            )
            DropdownMenuItem(
                text = { Text(text = "Settings") },
                onClick = { /* Handle settings */ },
                leadingIcon = {
                    Icon(Icons.Default.Settings, contentDescription = null)
                }
            )
            Divider()
            DropdownMenuItem(
                text = { Text(text = "Send Feedback") },
                onClick = { /* Handle feedback */ },
                leadingIcon = {
                    Icon(Icons.Default.Email, contentDescription = null)
                },
                trailingIcon = { Text(text = "F11")}
            )
        }
    }
}