package com.Milo_website.website.components

import androidx.compose.runtime.Composable
import com.Milo_website.website.styles.ButtonSize2 as Food
import com.Milo_website.website.styles.SocialIconStyle
import com.Milo_website.website.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun LeftSide(
    colorMode: ColorMode,
    breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ){
        SpanText(
            text = Res.String.USERNAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.GRESTAL) //das da hat funktioniert scheis programm lol
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if(breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .margin(bottom = 18.px)
                .fontFamily(Res.String.TAHOMA)
                .fontSize(24.px)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
        )
        Surface(
            modifier = Modifier //the small line under profession
                .height(4.px)
                .width(40.px)
                .margin(bottom = 18.px)
                .background(if (colorMode.isLight) Res.Theme.BLUE.color
                else Res.Theme.LIGHT_BLUE.color)
                .align(
                    if(breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ){}
        SpanText(
            text = Res.String.ABOUT,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.FANTASY)
                .fontSize(20.px)
                .color(if (colorMode.isLight) Colors.Black else Colors.LightBlue)
                .opacity(100.percent)
                .lineHeight(2)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        Button(
            modifier = Food.toModifier()
                .margin(bottom = 45.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = Res.String.MY_EMAIL}
        ){
            Image(
                modifier = Modifier.margin(right = 12.px),
                src = if(colorMode.isLight) Res.Icon.EMAIL_LIGHT
                else Res.Icon.EMAIL_DARK,
            )
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .color(if (colorMode.isLight) Colors.White
                        else Res.Theme.BLUE.color)
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.String.MONO),
                text = Res.String.BUTTON_TEXT,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if(breakpoint <= Breakpoint.SM)
                Arrangement.Center else Arrangement.Start

        ){
            SocialIcon.entries.filter{
                if(colorMode.isLight)!it.name.contains("Light")
                else it.name.contains("Light")
            }.forEach {
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    colorMode,
                    icon = it.icon,
                    link = it.link
                )
            }
        }
    }

}