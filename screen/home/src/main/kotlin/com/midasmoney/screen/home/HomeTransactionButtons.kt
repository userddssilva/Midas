package com.midasmoney.screen.home

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.midasmoney.shared.ui.core.MidasPreview

@Composable
fun HomeTransactionButtons(addIncomeAction: () -> Unit, addExpenseAction: () -> Unit) {
    Row(
        modifier = Modifier
            .padding(top = 40.dp)
    ) {
        TransactionButton(
            text = "Add Income",
            icon = Icons.Filled.KeyboardArrowUp,
            onClickAction = addIncomeAction
        )
        VerticalDivider(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .height(0.dp)
        )
        TransactionButton(
            text = "Add Expense",
            icon = Icons.Outlined.KeyboardArrowDown,
            onClickAction = addExpenseAction
        )
    }
}

@Preview
@Composable
fun HomeTransactionButtonsPreview() {
    MidasPreview {
        HomeTransactionButtons({}, {})
    }
}