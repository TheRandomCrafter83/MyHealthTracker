package com.coderz.f1.myhealthtracker.ui.theme

import android.view.Window
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

private val Colors.statusBarColor: Color
    get() {
        return primary
    }
private val Colors.navigationBarColor: Color
    get() {
        return primary
    }

private val DarkColorPalette = darkColors(
    primary = Gray700,
    primaryVariant = Blue700,
    secondary = Orange200
)

private val LightColorPalette = lightColors(
    primary = Blue500,
    primaryVariant = Blue700,
    secondary = Orange200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MyHealthTrackerTheme(
    window: Window,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
    window.statusBarColor = colors.statusBarColor.toArgb()
    window.navigationBarColor = colors.navigationBarColor.toArgb()
}