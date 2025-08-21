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
fun DataStorageSection(
    onBackup: () -> Unit,
    onRestore: () -> Unit,
    onExport: () -> Unit,
    onImport: () -> Unit,
    onReset: () -> Unit
) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("Data & Storage")
            Spacer(Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(onClick = onBackup) { Text("Backup") }
                OutlinedButton(onClick = onRestore) { Text("Restore") }
            }
            Spacer(Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(onClick = onExport) { Text("Export") }
                OutlinedButton(onClick = onImport) { Text("Import") }
            }
            Spacer(Modifier.height(8.dp))
            OutlinedButton(onClick = onReset) { Text("Reset app data") }
        }
    }
}
