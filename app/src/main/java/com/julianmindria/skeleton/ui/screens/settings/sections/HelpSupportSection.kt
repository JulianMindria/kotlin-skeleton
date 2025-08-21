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
fun HelpSupportSection(
    onFAQ: () -> Unit,
    onContact: () -> Unit,
    onReport: () -> Unit
) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("Help & Support")
            Spacer(Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(onClick = onFAQ) { Text("FAQ") }
                OutlinedButton(onClick = onContact) { Text("Contact") }
                OutlinedButton(onClick = onReport) { Text("Report a problem") }
            }
        }
    }
}
