package com.compose.whatsappui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Normal
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.whatsappui.R
import com.compose.whatsappui.ui.data.Call

@Composable
fun CallsItem( call: Call) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = 5.dp)
    ) {
        Image(
            painter = painterResource(id = call.drawable),
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
                text = call.name, color = Color.Black,
                fontSize = 16.sp, fontStyle = FontStyle.Normal, fontWeight = Bold
            )
            Row(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
            ) {
                Image(
                    modifier = Modifier
                        .wrapContentHeight()
                        .wrapContentWidth(),
                    painter = painterResource(id = R.drawable.ic_baseline_call_missed_outgoing_24),
                    contentDescription = null
                )
                Text(
                    text = call.subtitle, color = Color.Gray,
                    fontSize = 14.sp, fontStyle = FontStyle.Normal, fontWeight = Normal
                )
            }

        }
        Icon(
            modifier = Modifier
                .wrapContentHeight()
                .wrapContentWidth()
                .align(CenterVertically), tint = Color(0xFF008065),
            imageVector = Icons.Default.Call,
            contentDescription = null
        )
    }
}