package com.compose.whatsappui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Normal
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.whatsappui.R
import com.compose.whatsappui.ui.data.Status

@Composable
fun StatusItem(status: Status) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight().padding(vertical = 5.dp)
    ) {
        Image(
            painter = painterResource(id = status.drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.CenterStart,
            modifier = Modifier
                .size(50.dp)
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .border(
                    shape = CircleShape,
                    color = Color.Gray,
                    width = 1.dp
                )
                .padding(3.dp)
                .clip(CircleShape)

        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .weight(1f)
                .padding(5.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = status.title, color = Color.Black,
                fontSize = 16.sp, fontStyle = FontStyle.Normal, fontWeight = Bold
            )
            Text(
                text = status.subTitle, color = Color.Gray,
                fontSize = 14.sp, fontStyle = FontStyle.Normal, fontWeight = Normal
            )
        }
    }
}