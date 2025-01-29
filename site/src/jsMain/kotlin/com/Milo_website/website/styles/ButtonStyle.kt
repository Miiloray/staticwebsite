package com.Milo_website.website.styles

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.Milo_website.website.util.Res
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ButtonSize2 = CssStyle{
    base{

        Modifier
            .padding(leftRight = 12.px)
            .background(if (colorMode.isLight) Colors.Blue
                        else Res.Theme.DARK_BLUE.color)
            .transition(Transition.of("all", duration = 300.ms)) //CSSTransition


    }
    hover{
        Modifier
            .background(if (colorMode.isLight) Colors.LightBlue
                        else Res.Theme.GRADIENT_ONE.color)
            .padding(leftRight = 20.px)

    }
}

