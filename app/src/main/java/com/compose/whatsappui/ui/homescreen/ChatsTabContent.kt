package com.compose.whatsappui.ui.homescreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.compose.whatsappui.ui.components.ContactItem
import com.compose.whatsappui.ui.data.ContactList.contactsList

@Composable

fun ChatTabContent() {

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(contactsList) { contactsList ->
            ContactItem(contactsList)
        }
    }
}