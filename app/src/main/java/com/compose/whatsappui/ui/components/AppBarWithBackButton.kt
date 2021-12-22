package com.compose.whatsappui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.whatsappui.R

/*
 -Creating TopAppBar.
 -Adding icons on th top bar.
 -adding menu and actions.
 */
@Composable
@Preview(showBackground = true)
fun AppToolBarWithBackButton() {
    var title = "Ahmed Emad"
    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color(0xFF008065),
        contentColor = Color.White,
        elevation = 5.dp
    ) {
        (Icon(imageVector = Icons.Default.ArrowBack, contentDescription = ""))

        Image(
            painter = painterResource(id = R.drawable.images_6),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.CenterStart,
            modifier = Modifier
                .size(30.dp)
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .border(
                    shape = CircleShape,
                    color = Color.Transparent,
                    width = 0.dp
                )
                .padding(3.dp)
                .clip(CircleShape)

        )
        Text(
            text = title,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 5.dp),
            fontSize = 20.sp
        )

        Icon(
            modifier = Modifier
                .size(24.dp)
                .weight(.2f),
            painter = painterResource(id = R.drawable.ic_baseline_videocam_24),
            contentDescription = ""
        )
        Icon(
            modifier = Modifier
                .size(24.dp)
                .weight(.2f),
            imageVector = Icons.Default.Call,
            contentDescription = ""
        )
        Box(
            contentAlignment = Alignment.TopEnd,
            modifier = Modifier
                .wrapContentSize(Alignment.TopEnd)
                .weight(.2f)
        ) {
            IconButton(onClick = { expanded = true }) {
                Icon(Icons.Default.MoreVert, contentDescription = "Localized description")
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(onClick = { /* Handle new group! */ }) {
                    Text(stringResource(id = R.string.view_contact))
                }
                DropdownMenuItem(onClick = { /* Handle new broadcast! */ }) {
                    Text(stringResource(id = R.string.media_links_docs))
                }
                DropdownMenuItem(onClick = { /* Handle linked devices! */ }) {
                    Text(stringResource(id = R.string.search))
                }
                DropdownMenuItem(onClick = { /* Handle sehared messages! */ }) {
                    Text(stringResource(id = R.string.mute_notifications))
                }
                DropdownMenuItem(onClick = { /* Handle settings! */ }) {
                    Text(stringResource(id = R.string.wallpaper))
                }
                DropdownMenuItem(onClick = { /* Handle settings! */ }) {
                    Text(stringResource(id = R.string.more))
                }
            }
        }
    }
}
