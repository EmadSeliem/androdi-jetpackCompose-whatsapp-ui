package com.compose.whatsappui.ui.homescreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.whatsappui.R
import com.compose.whatsappui.ui.components.CallsItem
import com.compose.whatsappui.ui.components.StatusItem
import com.compose.whatsappui.ui.data.CallList
import com.compose.whatsappui.ui.data.CallList.callList
import com.compose.whatsappui.ui.data.StatusList

@Composable
@Preview(showBackground = true)
fun CallTabContent() {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        items(callList) { callList ->
            CallsItem(call = callList)
        }
    }
}