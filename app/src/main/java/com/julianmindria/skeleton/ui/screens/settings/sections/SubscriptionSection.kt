package com.julianmindria.skeleton.ui.screens.settings.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SubscriptionSection(
    onManage: () -> Unit
) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("Subscription / Billing")
            Text("Manage premium plan and restore purchases.")
            Button(onClick = onManage, modifier = Modifier.padding(top = 8.dp)) {
                Text("Manage Subscription")
            }
        }
    }
}
