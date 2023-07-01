package com.example.material3components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BadgeM3() {
    BadgedBox(
        badge = {
            Badge { Text(text = "99+")}
        }
    ) {
       Icon(
           imageVector = Icons.Default.Favorite,
           contentDescription = "Favorite",
           modifier = Modifier.size(40.dp)
       )
    }
}