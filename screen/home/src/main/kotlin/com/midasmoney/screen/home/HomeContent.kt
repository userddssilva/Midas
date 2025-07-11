package com.midasmoney.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.midasmoney.shared.ui.core.MidasPreview
import com.midasmoney.shared.ui.core.Theme

@Composable
fun HomeContentImp() {
    HomeContent()
}

@Composable
fun HomeContent() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 78.dp, bottom = 100.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                BalanceStatus(
                    totalValue = "$4,250.00",
                    incomeValue = "+$3,200",
                    expenseValue = "-$1,850"
                )
                HomeTransactionButtons({}, {})
                TitleItem(
                    textTitle = "Recent Transactions",
                    textButton = "View All",
                    actionButton = {}
                )
                TransactionCard(
                    title = "Grocery Store",
                    date = "Jan 15, 2025",
                    value = "-$85.50",
                    icon = Icons.Filled.ShoppingCart
                )
                TransactionCard(
                    title = "Grocery Store",
                    date = "Jan 15, 2025",
                    value = "-$85.50",
                    icon = Icons.Filled.ShoppingCart
                )
                TransactionCard(
                    title = "Grocery Store",
                    date = "Jan 15, 2025",
                    value = "-$85.50",
                    icon = Icons.Filled.ShoppingCart
                )
                TitleItem(
                    textTitle = "Financial Goals",
                    textButton = "Manage",
                    actionButton = {}
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeContentImpLightPreview() {
    MidasPreview(
        theme = Theme.LIGHT
    ) {
        HomeContent()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeContentImpDarkPreview() {
    MidasPreview(
        theme = Theme.DARK
    ) {
        HomeContent()
    }
}