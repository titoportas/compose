package com.titoportas.compose_interop

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.AbstractComposeView
import com.titoportas.ui_compose.badge.ComposeBadgeDot
import com.titoportas.ui_compose.badge.type.AndesBadgeType


class InteropBadgeDot @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {

    // Create a State for the title text so any changes can be observed and reflected automatically
    // in our Composable Text.
    private val composeType = mutableStateOf(AndesBadgeType.NEUTRAL)

    // Public getter/setter for our title that delegates to the State value.
    var type: AndesBadgeType
        get() = composeType.value
        set(value) {
            composeType.value = value
        }

    @Composable
    override fun Content() {
        ComposeBadgeDot(composeType.value)
    }
}
