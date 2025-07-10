package com.midasmoney.screen.goals

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
fun GoalsContentImp() {
    val goalsViewModel = GoalsViewModel()
    GoalsContent(goalsViewModel.text.value.toString())
}

@Composable
fun GoalsContent(text: String) {
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
fun GoalsContentImpPreview(){
    val goalsViewModel = GoalsViewModel()
    GoalsContent(goalsViewModel.text.value.toString())
}