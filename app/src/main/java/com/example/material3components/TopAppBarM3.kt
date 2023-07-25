package com.example.material3components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.ListItem
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarWithScaffold() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { LargeTopAppBarM3(scrollBehavior = scrollBehavior) }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(50) {
                ListItem(
                    headlineContent = { Text(text = "Item $it") },
                    leadingContent = {
                        Icon(
                            imageVector = Icons.Default.Face,
                            contentDescription = null
                        )
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarM3(
    scrollBehavior: TopAppBarScrollBehavior
) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(text = "Top Stories") },
        navigationIcon = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Open Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Open Likes")
            }
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Open Settings")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterTopAppBarM3(
    scrollBehavior: TopAppBarScrollBehavior
) {
    CenterAlignedTopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(text = "Top Stories") },
        navigationIcon = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Open Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Open Likes")
            }
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Open Settings")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MediumTopAppBarM3(
    scrollBehavior: TopAppBarScrollBehavior
) {
    MediumTopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(text = "Top Stories") },
        navigationIcon = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Open Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Open Likes")
            }
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Open Settings")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LargeTopAppBarM3(
    scrollBehavior: TopAppBarScrollBehavior
) {
    LargeTopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                text = "Banff National Park Trails",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Open Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Open Likes")
            }
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Open Settings")
            }
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "Open Options")
            }
        }
    )
}