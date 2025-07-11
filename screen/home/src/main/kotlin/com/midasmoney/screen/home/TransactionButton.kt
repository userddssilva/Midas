package com.midasmoney.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.midasmoney.shared.ui.core.MidasPreview
import com.midasmoney.shared.ui.core.Theme

@Composable
fun TransactionButton(text: String, icon: ImageVector, onClickAction: () -> Unit) {
    Button(
        onClick = onClickAction,
        shape = RoundedCornerShape(6.dp),
        colors = ButtonColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
            disabledContentColor = MaterialTheme.colorScheme.secondary,
            disabledContainerColor = MaterialTheme.colorScheme.onSecondary
        ),
        modifier = Modifier
            .height(90.dp)
            .width(170.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Add icon",
                tint = MaterialTheme.colorScheme.onPrimary
            )
            Text(
                text = text,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview
@Composable
fun TransactionButtonPreview() {
    MidasPreview(
        theme = Theme.DARK
    ) {
        TransactionButton(text = "Add Income", Icons.Filled.Add, {})
    }
}