package com.compose.whatsappui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
- Reusbale component for text with round border.
 */
@Composable
fun TextWithRoundBorder(
    modifier: Modifier? = null,
    backGroundcolor: Color,
    textColor: Color,
    textNumbers: String
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .wrapContentWidth()
            .defaultMinSize(minWidth = 20.dp)
            .border(1.dp, color = backGroundcolor, shape = CircleShape)
            .background(color = backGroundcolor, shape = CircleShape)
    ) {
        Text(
            color = textColor, text = textNumbers,
            modifier = Modifier
                .wrapContentWidth()
                .padding(4.dp),
            textAlign = TextAlign.Center,
            fontSize = 10.sp
        )
    }
}