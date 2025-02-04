package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define custom colors
val OrangePrimary = Color(0xFFF7921E)
val DarkPrimary = Color(0xFF121212)
val White = Color(0xFFFFFFFF)

// Define color schemes
val LightColorScheme = lightColorScheme(
    primary = OrangePrimary,
    onPrimary = White,
    background = White,
    onBackground = DarkPrimary
)

val DarkColorScheme = darkColorScheme(
    primary = OrangePrimary,
    onPrimary = DarkPrimary,
    background = DarkPrimary,
    onBackground = White
)

@Composable
fun ThemingTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),  // Tự động theo hệ thống
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}