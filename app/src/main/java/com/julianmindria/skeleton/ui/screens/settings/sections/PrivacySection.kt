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
fun PrivacySection(
    onLockSetup: () -> Unit,
    onPermissions: () -> Unit
) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("Privacy & Security")
            Spacer(Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(onClick = onLockSetup) { Text("Set App Lock") }
                OutlinedButton(onClick = onPermissions) { Text("Manage Permissions") }
            }
        }
    }
}
