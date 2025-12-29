package id.antasari.p5_datasave_230104040222.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = KevaBlue,
    onPrimary = Color.White,
    secondary = KevaTeal,
    onSecondary = Color.White,
    tertiary = KevaPurple,

    background = KevaBg,
    onBackground = KevaOnBg,
    surface = Color.White,
    onSurface = KevaOnBg,

    surfaceVariant = Color(0xFFE8EEF5),
    onSurfaceVariant = Color(0xFF334155),
    outline = Color(0xFFCBD5E1)
)

private val DarkColors = darkColorScheme(
    primary = KevaGreen,
    onPrimary = KevaOnPrimaryDark, // agar kontras di surface primary gelap
    secondary = KevaBlue,
    onSecondary = Color.White,
    tertiary = KevaTeal,
)

@Composable
fun KevaTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    val scheme = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = scheme,
        // Kalau Anda punya Typography/Shapes khusus, panggil di sini.
        content = content
    )
}