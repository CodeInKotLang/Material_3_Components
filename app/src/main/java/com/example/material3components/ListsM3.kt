package com.example.material3components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun ListsM3() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items = tasks, key = {it.id }) {task ->
            ListItem(
                headlineContent = { Text(text = task.name)},
                supportingContent = {Text(text = task.description)},
                leadingContent = {
                    Icon(imageVector = task.icon, contentDescription = task.name)
                },
                trailingContent = {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = task.name)
                }
            )
        }
    }
}

data class Task(
    val id: Int,
    val name: String,
    val icon: ImageVector,
    val description: String
)

val tasks = listOf(
    Task(1, "Buy Groceries", Icons.Outlined.ShoppingCart, "Milk, Eggs, Bread"),
    Task(2, "Call Mom", Icons.Outlined.Call, "Discuss plans"),
    Task(3, "Finish Kotlin Project", Icons.Outlined.Build, "Implement Search"),
    Task(4, "Go for a Run", Icons.Outlined.Lock, "5km around the park"),
    Task(5, "Read a Book", Icons.Outlined.Email, " Complete a chapter of '1920'"),
)