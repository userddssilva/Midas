package com.midasmoney.screen.analytics

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AnalyticsContentImp() {
    val analyticsViewModel = AnalyticsViewModel()
    AnalyticsContent(analyticsViewModel.text.value.toString())
}

@Composable
fun AnalyticsContent(text: String) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnalyticsContentImpPreview(){
    val analyticsViewModel = AnalyticsViewModel()
    AnalyticsContent(analyticsViewModel.text.value.toString())
}