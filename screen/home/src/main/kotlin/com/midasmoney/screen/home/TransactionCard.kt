package com.midasmoney.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.midasmoney.shared.ui.core.MidasPreview
import com.midasmoney.shared.ui.core.Theme

@Composable
fun TransactionCard(
    title: String,
    date: String,
    value: String,
    icon: ImageVector
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 25.dp, end = 18.dp, top = 15.dp)
            .height(70.dp),
        colors = CardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
            disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
            disabledContentColor = MaterialTheme.colorScheme.onSecondaryContainer
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 18.dp, top = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(0.2f)
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Card transaction icon",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.inverseSurface)
                        .padding(10.dp)
                )
            }
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .weight(0.6f)
            ) {
                Row {
                    Text(
                        text = title,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }
                Row {
                    Text(
                        text = date,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .weight(0.3f)
            ) {
                Text(
                    text = value,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }
    }
}

@Preview
@Composable
fun TransactionCardLightPreview() {
    MidasPreview(
        theme = Theme.LIGHT
    ) {
        TransactionCard(
            title = "Grocery Store",
            date = "Jan 15, 2025",
            value = "-$85.50",
            icon = Icons.Filled.ShoppingCart
        )
    }
}

@Preview
@Composable
fun TransactionCardDarkPreview() {
    MidasPreview(
        theme = Theme.DARK
    ) {
        TransactionCard(
            title = "Grocery Store",
            date = "Jan 15, 2025",
            value = "-$85.50",
            icon = Icons.Filled.ShoppingCart
        )
    }
}