package com.example.material3components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun AlertDialogM3() {

    var openDialog by remember { mutableStateOf(false) }

    IconButton(onClick = { openDialog = true }) {
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = "Delete Icon"
        )
    }

    if (openDialog) {
        AlertDialog(
            onDismissRequest = { openDialog = false },
            title = {
                Text(text = "Delete Selected Image?")
            },
            text = {
                Text(text = "Are you sure, you want to permanently delete the selected image.")
            },
            confirmButton = {
                TextButton(onClick = {
                    /* viewModel.deleteImage */
                    openDialog = false
                }) {
                    Text(text = "Yes")
                }
            },
            dismissButton = {
                TextButton(onClick = { openDialog = false }) {
                    Text(text = "No")
                }
            }
        )
    }
}

@Composable
fun DialogM3() {
    var openDialog by remember { mutableStateOf(false) }

    IconButton(onClick = { openDialog = true }) {
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = "Delete Icon"
        )
    }

    if (openDialog) {
        Dialog(onDismissRequest = { openDialog = false }) {
            Surface {
                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "Congratulation",
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Text(
                        text = "You have cleared all the stages",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Button(onClick = { openDialog = false }) {
                        Text(text = "Play")
                    }
                }
            }
        }
    }
}