package com.compose.whatsappui.ui.chat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.compose.whatsappui.R
import com.compose.whatsappui.ui.homescreen.FloatingIcon

@Composable
fun SendChatMessage(modifier: Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
//....................Send Message.......................
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth(.84f)
                .height(50.dp)
                .clip(RoundedCornerShape(50.dp))
                .background(color = Color(0xFFFFFFFF))

        ) {
            Spacer(modifier = Modifier.width(10.dp))

            Image(
                modifier = Modifier
                    .size(24.dp),
                painter = painterResource(id = R.drawable.ic_baseline_insert_emoticon_24),
                contentDescription = "Emoji"
            )
            Text(
                text = "Message", modifier = Modifier
                    .fillMaxWidth(.75f)
                    .padding(horizontal = 5.dp),
                textAlign = TextAlign.Start,
                color = Color(0xFF98A9B1)
            )
            Image(
                modifier = Modifier
                    .size(24.dp),
                painter = painterResource(id = R.drawable.ic_baseline_attach_file_24),
                contentDescription = "Add Attachment"
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
                modifier = Modifier
                    .size(24.dp),
                painter = painterResource(id = R.drawable.ic_baseline_gray_photo_camera_24),
                contentDescription = "Camera"
            )
            Spacer(modifier = Modifier.width(10.dp))

        }
        Spacer(modifier = Modifier.width(10.dp))
        //........................
        FloatingActionButton(
            modifier = Modifier
                .size(50.dp), backgroundColor = Color(0xFF008065),
            onClick = { /*do something*/
            }) {
            FloatingIcon(drawerId = R.drawable.ic_baseline_keyboard_voice_24)
        }

        // .........................
    }

}
