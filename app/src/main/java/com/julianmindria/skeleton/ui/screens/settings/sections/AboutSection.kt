package com.julianmindria.skeleton.ui.screens.settings.sections

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.billingclient.BuildConfig

@Composable
fun AboutSection(
    onTerms: () -> Unit,
    onPrivacy: () -> Unit,
    versionName: String = BuildConfig.VERSION_NAME
) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("About")
            Spacer(Modifier.height(4.dp))
            Text("Version: $versionName")
            Spacer(Modifier.height(8.dp))
            Row {
                TextButton(onClick = onTerms) { Text("Terms of Service") }
                Spacer(Modifier.width(8.dp))
                TextButton(onClick = onPrivacy) { Text("Privacy Policy") }
            }
        }
    }
}
