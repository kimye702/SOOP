package com.example.soop

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun Text14sp(
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    modifier: Modifier = Modifier,
    color: Color = colorResource(id = R.color.gray_text),
    ) {
    Text(
        text = text,
        style = TextStyle(
            color = color,
            fontSize = 14.sp,
            textAlign = textAlign
        ),
        modifier = modifier
    )
}