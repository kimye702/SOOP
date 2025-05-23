package com.example.soop.emotionlogs.widget.MonthCustomCalendar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.soop.R
import com.example.soop.itemlist.GradationCircleImage

@Composable
fun MonthCustomCalendarDay(
    day: Int,
    imageIndex: Int?,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(Color.White)
            .border(1.dp, Color(0xFFEBEBEB), CircleShape)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        if (imageIndex != null) {
            GradationCircleImage(index = imageIndex)
        }
        Text(
            text = "$day",
            fontSize = 14.sp,
            color = colorResource(R.color.middle_gray_text)
        )
    }
}
