package com.midasmoney.app.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.midasmoney.app.screen.home.HomeDescription
import com.midasmoney.app.screen.home.HomeViewModel

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        return ComposeView(requireContext()).apply {
            setContent {
                MaterialTheme {
                    HomeDescription(homeViewModel)
                }
            }
        }
    }
}