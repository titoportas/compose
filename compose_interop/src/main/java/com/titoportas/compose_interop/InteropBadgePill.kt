package com.titoportas.compose_interop

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.AbstractComposeView
import com.titoportas.ui_compose.badge.ComposeBadgeDot
import com.titoportas.ui_compose.badge.ComposeBadgePill
import com.titoportas.ui_compose.badge.border.AndesBadgePillBorder
import com.titoportas.ui_compose.badge.hierarchy.AndesBadgePillHierarchy
import com.titoportas.ui_compose.badge.size.AndesBadgePillSize
import com.titoportas.ui_compose.badge.type.AndesBadgeType

class InteropBadgePill @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {

    private val composePillSize = mutableStateOf(AndesBadgePillSize.LARGE)

    private val composePillBorder = mutableStateOf(AndesBadgePillBorder.ROUNDED)
    var pillBorder: AndesBadgePillBorder
        get() = composePillBorder.value
        set(value) {
            composePillBorder.value = value
        }
    private val composePillHierarchy = mutableStateOf(AndesBadgePillHierarchy.LOUD)
    var pillHierarchy: AndesBadgePillHierarchy
        get() = composePillHierarchy.value
        set(value) {
            composePillHierarchy.value = value
        }

    private val composeType = mutableStateOf(AndesBadgeType.NEUTRAL)
    var type: AndesBadgeType
        get() = composeType.value
        set(value) {
            composeType.value = value
        }

    private val composeText = mutableStateOf<String?>(null)
    var text: String?
        get() = composeText.value
        set(value) {
            composeText.value = value
        }

    @Composable
    override fun Content() {
        ComposeBadgePill(
            composePillHierarchy.value,
            composeType.value,
            composePillBorder.value,
            composePillSize.value,
            composeText.value
        )
    }
}
