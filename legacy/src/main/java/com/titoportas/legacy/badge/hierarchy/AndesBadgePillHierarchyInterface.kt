package com.titoportas.legacy.badge.hierarchy

import com.titoportas.legacy.badge.type.AndesBadgeTypeInterface
import com.titoportas.legacy.R
import com.titoportas.legacy.color.AndesColor
import com.titoportas.legacy.color.toAndesColor


/**
 * Defines all style related properties that an [AndesBadge] needs to be drawn properly.
 * Those properties change depending on the style of the badge.
 *
 */
internal interface AndesBadgePillHierarchyInterface {
    /**
     * Returns a [AndesColor] that contains the color data for the message background.
     *
     * @param type is the selected type of badge.
     * @return a [AndesColor] that contains the color data for the badge background.
     */
    fun backgroundColor(type: AndesBadgeTypeInterface): AndesColor

    /**
     * Returns a [AndesColor] that contains the data for the text color.
     * We are using [AndesColor] because text color depends on the badge type.
     *
     * @param type is the selected type of badge.
     * @return a [AndesColor] that contains the data for the text color.
     */
    fun textColor(type: AndesBadgeTypeInterface): AndesColor
}

internal class AndesLoudBadgeHierarchy : AndesBadgePillHierarchyInterface {
    override fun backgroundColor(type: AndesBadgeTypeInterface) = type.primaryColor()
    override fun textColor(type: AndesBadgeTypeInterface) = R.color.andes_white.toAndesColor()
}

internal class AndesQuietBadgeHierarchy : AndesBadgePillHierarchyInterface {
    override fun backgroundColor(type: AndesBadgeTypeInterface) = type.secondaryColor()
    override fun textColor(type: AndesBadgeTypeInterface) = type.primaryColor()
}
