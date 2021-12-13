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
import com.compose.whatsappui.ui.components.StatusItem
import com.compose.whatsappui.ui.data.StatusList

@Composable
@Preview(showBackground = true)
fun StatusTabContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        StatusItem(status = StatusList.statusList[0])

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )

        Text(
            text = stringResource(id = R.string.recent_updates),
            color = Color.Gray,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(StatusList.statusList.subList(1, StatusList.statusList.size)) { statusList ->
                StatusItem(status = statusList)
            }
        }
    }
}