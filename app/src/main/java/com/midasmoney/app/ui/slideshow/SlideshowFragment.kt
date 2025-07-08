package com.midasmoney.app.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.midasmoney.app.screen.slideshow.SlideshowDescription
import com.midasmoney.app.screen.slideshow.SlideshowViewModel

class SlideshowFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel = ViewModelProvider(this)[SlideshowViewModel::class.java]
        return ComposeView(requireContext()).apply {
            setContent {
                MaterialTheme {
                    SlideshowDescription(slideshowViewModel)
                }
            }
        }
    }
}