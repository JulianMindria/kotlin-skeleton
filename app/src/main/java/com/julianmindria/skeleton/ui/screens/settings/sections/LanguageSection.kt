package com.julianmindria.skeleton.ui.screens.settings.sections

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LanguageSection(
    current: String,
    onChange: (String) -> Unit
) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("Language")
            Spacer(Modifier.height(8.dp))
            val items = listOf("en" to "English", "id" to "Bahasa Indonesia")
            items.forEach { (code, label) ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .clickable { onChange(code) }
                        .padding(vertical = 8.dp),
                ) {
                    Column(Modifier.weight(1f)) { Text(label) }
                    RadioButton(selected = current == code, onClick = { onChange(code) })
                }
            }
        }
    }
}
