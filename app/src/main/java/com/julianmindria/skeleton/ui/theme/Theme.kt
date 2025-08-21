package com.julianmindria.skeleton.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

//private val DarkColorScheme = darkColorScheme(
//    primary = Purple80,
//    secondary = PurpleGrey80,
//    tertiary = Pink80
//)
//
//private val LightColorScheme = lightColorScheme(
//    primary = Purple40,
//    secondary = PurpleGrey40,
//    tertiary = Pink40
//
//    /* Other default colors to override
//    background = Color(0xFFFFFBFE),
//    surface = Color(0xFFFFFBFE),
//    onPrimary = Color.White,
//    onSecondary = Color.White,
//    onTertiary = Color.White,
//    onBackground = Color(0xFF1C1B1F),
//    onSurface = Color(0xFF1C1B1F),
//    */
//)

private val LightColors = lightColorScheme(
    primary = BluePrimary,
    onPrimary = BlueOnPrimary,
    primaryContainer = BluePrimaryDark,
    onPrimaryContainer = BlueOnPrimary,

    secondary = GreenSecondary,
    onSecondary = GreenOnSecondary,

    tertiary = AmberTertiary,
    onTertiary = AmberOnTertiary,

    background = BackgroundLight,
    surface = SurfaceLight,
    onSurface = OnSurface,
    surfaceVariant = SurfaceVariant,
    outline = Outline
)

private val DarkColors = darkColorScheme(
    // Brand colors
    primary = Color(0xFFDFA300),       // Harvest Gold
    onPrimary = Color(0xFF181714),     // Text/icon on gold → Eerie Black for contrast

    secondary = Color(0xFFDFA300),     // Reuse gold for accents
    onSecondary = Color(0xFF181714),

    tertiary = Color(0xFFDFA300),      // Optional: same gold for highlights
    onTertiary = Color(0xFF181714),

    // Surfaces
    background = Color(0xFF181714),    // Eerie Black → main background
    surface = Color(0xFF1C1B1A),       // Jet → card / container
    onSurface = Color(0xFFECEFF4),     // Light neutral text

    // Variants
    surfaceVariant = Color(0xFF242A31), // Slightly lighter than Jet
    outline = Color(0xFF445263)        // Keep outline subtle but visible
)



@Composable
fun StreaksTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = MaterialTheme.typography,
        content = content
    )
}