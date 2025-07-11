package com.midasmoney.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.midasmoney.shared.ui.core.MidasPreview
import com.midasmoney.shared.ui.core.Theme

@Composable
fun BalanceStatus(
    totalValue: String,
    incomeValue: String,
    expenseValue: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(top = 16.dp)
        ) {
            Text(
                text = "Total Balance",
                fontSize = 18.sp,
                color = Color.Gray
            )
        }
        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = totalValue,
                fontSize = 38.sp,
                color = Color.White
            )
        }

        Row {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Income",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = incomeValue,
                    color = Color.Gray,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }
            VerticalDivider(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .height(0.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Expense",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = expenseValue,
                    color = Color.Gray,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun BalanceStatusPreview(){
    MidasPreview(
        theme = Theme.LIGHT
    ) {
        BalanceStatus(
            totalValue = "$4,250.00",
            incomeValue = "+$3,200",
            expenseValue = "-$1,850"
        )
    }
}