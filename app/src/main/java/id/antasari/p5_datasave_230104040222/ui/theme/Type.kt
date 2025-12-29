package id.antasari.p5_datasave_230104040222.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val KevaTypography = Typography(
    titleLarge  = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.SemiBold),
    titleMedium = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold),
    titleSmall  = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium),

    bodyLarge   = TextStyle(fontSize = 16.sp),
    bodyMedium  = TextStyle(fontSize = 14.sp),
    bodySmall   = TextStyle(fontSize = 12.sp),

    labelLarge  = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium),
    labelMedium = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Medium),
    labelSmall  = TextStyle(fontSize = 11.sp)
).let { base ->
    // Jika butuh FontFamily khusus, ganti di sini (mis. Inter / Roboto)
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
    base.copy()
}