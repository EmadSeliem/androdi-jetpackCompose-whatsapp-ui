package com.compose.whatsappui.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.whatsappui.R

/*
 -Creating TopAppBar.
 -Adding icons on th top bar.
 -adding menu and actions.
 */
@Composable
fun AppToolBar(title: String) {
    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color(0xFF008065),
        contentColor = Color.White,
        elevation = 0.dp

    ) {
        Text(
            text = title,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
            fontSize = 20.sp
        )

        Icon(
            modifier = Modifier.size(24.dp),
            imageVector = Icons.Default.Search,
            contentDescription = ""
        )
        Box(contentAlignment = Alignment.TopEnd,modifier = Modifier.wrapContentSize(Alignment.TopEnd)) {
            IconButton(onClick = { expanded = true }) {
                Icon(Icons.Default.MoreVert, contentDescription = "Localized description")
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(onClick = { /* Handle new group! */ }) {
                    Text(stringResource(id = R.string.new_group))
                }
                DropdownMenuItem(onClick = { /* Handle new broadcast! */ }) {
                    Text(stringResource(id = R.string.new_broadcast))
                }
                DropdownMenuItem(onClick = { /* Handle linked devices! */ }) {
                    Text(stringResource(id = R.string.linked_devices))
                }
                DropdownMenuItem(onClick = { /* Handle sehared messages! */ }) {
                    Text(stringResource(id = R.string.shared_messages))
                }
                DropdownMenuItem(onClick = { /* Handle settings! */ }) {
                    Text(stringResource(id = R.string.settings))
                }
            }
        }
    }
}
