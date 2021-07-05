package com.mercadolibre.android.andesui.badge.type

import com.titoportas.legacy.badge.type.*
import com.titoportas.legacy.badge.type.AndesBadgeTypeInterface
import com.titoportas.legacy.badge.type.AndesErrorBadgeType
import com.titoportas.legacy.badge.type.AndesHighlightBadgeType
import com.titoportas.legacy.badge.type.AndesNeutralBadgeType
import com.titoportas.legacy.badge.type.AndesSuccessBadgeType
import com.titoportas.legacy.badge.type.AndesWarningBadgeType

/**
 * Utility class that does two things: Defines the possible styles an [AndesBadge] can take because it's an enum, as you can see.
 * But as a bonus it gives you the proper implementation so you don't have to make any mapping.
 *
 * You ask me with, let's say 'QUIET', and then I'll give you a proper implementation of that style.
 *
 * @property type Possible styles that an [AndesBadge] may take.
 */
enum class AndesBadgeType {
    NEUTRAL,
    HIGHLIGHT,
    SUCCESS,
    WARNING,
    ERROR;

    companion object {
        fun fromString(value: String): AndesBadgeType = valueOf(value.toUpperCase())
    }

    internal val type get() = getAndesBadgeHierarchy()

    private fun getAndesBadgeHierarchy(): AndesBadgeTypeInterface {
        return when (this) {
            NEUTRAL -> AndesNeutralBadgeType()
            HIGHLIGHT -> AndesHighlightBadgeType()
            SUCCESS -> AndesSuccessBadgeType()
            WARNING -> AndesWarningBadgeType()
            ERROR -> AndesErrorBadgeType()
        }
    }
}
