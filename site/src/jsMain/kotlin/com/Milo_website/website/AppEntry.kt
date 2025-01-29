package com.Milo_website.website

import androidx.compose.runtime.*
import com.Milo_website.website.util.Res
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.palette.button
import org.jetbrains.compose.web.css.*

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
/*
@InitSilk
fun overrideSilkTheme(context: InitSilkContext) {
    context.apply {
        theme.palettes.apply {
            light.apply {
                button.apply {
                    default = Res.Theme.BLUE.color as Color //Typecasting csscolors to color
                    hover = Res.Theme.BLUE.color as Color
                    pressed = Res.Theme.BLUE.color as Color
                }
            }

            dark.apply {
                button.apply {
                    default = Res.Theme.LIGHT_BLUE.color as Color
                    hover = Res.Theme.LIGHT_BLUE.color as Color
                    pressed = Res.Theme.LIGHT_BLUE.color as Color
                }
            }
        }
    }
}
*/
