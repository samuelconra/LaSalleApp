package com.samuelconra.lasalleapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = BlueSalle,
    secondary = Red,
    onPrimary = White,
    onSecondary = Color.Black,
    background = GrayLight,
    onBackground = GrayDark,

    surface = RedSalle,
    onSurface = DarkerRed,
    tertiary = GrayContainer,
    onTertiary = TextGrayContainer,
    tertiaryContainer = DollBlue,
    onTertiaryContainer = TextBlue,

    surfaceVariant = GreenState,
    onSurfaceVariant = YellowState
)

private val LightColorScheme = lightColorScheme(
    primary = BlueSalle,
    secondary = Red,
    onPrimary = White,
    onSecondary = Color.Black,
    background = GrayLight,
    onBackground = GrayDark,

    surface = RedSalle,
    onSurface = DarkerRed,
    tertiary = GrayContainer,
    onTertiary = TextGrayContainer,
    tertiaryContainer = DollBlue,
    onTertiaryContainer = TextBlue,

    surfaceVariant = GreenState,
    onSurfaceVariant = YellowState,

    onPrimaryContainer = GrayDark

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun LaSalleAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = poppinsTypo,
        content = content
    )
}