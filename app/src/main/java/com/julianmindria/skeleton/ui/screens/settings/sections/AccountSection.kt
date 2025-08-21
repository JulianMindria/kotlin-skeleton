package com.julianmindria.skeleton.ui.screens.settings.sections

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccountSection(
    onLogin: () -> Unit,
    onLogout: () -> Unit
) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("Account / Profile")
            Spacer(Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(onClick = onLogin) { Text("Login") }
                OutlinedButton(onClick = onLogout) { Text("Logout") }
            }
        }
    }
}
