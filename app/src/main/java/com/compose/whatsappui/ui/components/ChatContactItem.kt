package com.compose.whatsappui.ui.components

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import com.compose.Screen
import com.compose.whatsappui.MainActivity
import com.compose.whatsappui.ui.chat.ChatActivity
import com.compose.whatsappui.ui.data.Contact
import com.compose.whatsappui.ui.homescreen.ContactsHomeScreen

/*
-Creating Item list for contacts.
 */
@Composable
fun ContactItem(contact: Contact) {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .clickable {
                context.startActivity(Intent(context, ChatActivity::class.java))
            }

    ) {
        Image(
            painter = painterResource(id = contact.drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.CenterStart,
            modifier = Modifier
                .size(60.dp)
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .border(
                    shape = CircleShape,
                    color = Color.Transparent,
                    width = 1.dp
                )
                .padding(3.dp)
                .clip(CircleShape)

        )

        Column(
            modifier = Modifier
                .wrapContentWidth()
                .weight(1f)
                .padding(horizontal = 10.dp)
                .align(CenterVertically)

        ) {
            Text(
                color = Color(0xFF061B21),
                text = contact.contactName,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start, fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                color = Color(0xFF738588),
                text = contact.messsage,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start,
                fontSize = 16.sp
            )
        }
        Column(
            modifier = Modifier
                .wrapContentWidth()
                .align(CenterVertically), horizontalAlignment = End
        ) {
            Text(
                color = Color(0xFF46CB90),
                text = contact.time,
                modifier = Modifier.wrapContentWidth(),
                textAlign = TextAlign.Center,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            TextWithRoundBorder(
                modifier = Modifier
                    .align(End)
                    .padding(16.dp),
                backGroundcolor = Color(0xFF00D869),
                textColor = Color.White,
                textNumbers = contact.numbers.toString()
            )
        }

    }
}