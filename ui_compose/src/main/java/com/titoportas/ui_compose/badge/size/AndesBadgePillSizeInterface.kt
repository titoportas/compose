package com.titoportas.ui_compose.badge.size

import androidx.annotation.DimenRes
import com.titoportas.ui_compose.R

/**
 * Defines all size related properties that an [AndesBadge] needs to be drawn properly.
 * Those properties change depending on the size of the badge.
 */
internal interface AndesBadgeSizeInterface {
    /**
     * Returns a [Float] representing the text size to be used.
     *
     * @param context needed for accessing some resources.
     * @return a [Float] representing the text size to be used.
     */
    @DimenRes
    fun textSize(): Int

    /**
     * Returns a [Float] representing the height size to be used.
     *
     * @param context needed for accessing some resources.
     * @return a [Float] representing the height size to be used.
     */
    @DimenRes
    fun height(): Int

    /**
     * Returns an [Int] representing the margin to be used.
     *
     * @param context needed for accessing some resources.
     * @return an [Int] representing the margin to be used.
     */
    @DimenRes
    fun textMargin(): Int

    /**
     * Returns a [Float] representing the corner radius to be used.
     *
     * @param context needed for accessing some resources.
     * @return a [Float] representing the corner radius to be used.
     */
    @DimenRes
    fun cornerRadius(): Int
}

/**
 * Implementation of [AndesBadgeSizeInterface] that returns the required data but personalized for the Large Size,
 * according to Andes specifications.
 *
 */
internal class AndesLargeBadgeSize : AndesBadgeSizeInterface {
    override fun textSize() = R.dimen.andes_badge_large_text_size
    override fun height() = R.dimen.andes_badge_large_height
    override fun textMargin() = R.dimen.andes_badge_large_text_margin
    override fun cornerRadius() = R.dimen.andes_badge_large_corner_radius
}

/**
 * Implementation of [AndesBadgeSizeInterface] that returns the required data but personalized for the Small Size,
 * according to Andes specifications.
 */
internal class AndesSmallBadgeSize : AndesBadgeSizeInterface {
    override fun textSize() = R.dimen.andes_badge_small_text_size
    override fun height() = R.dimen.andes_badge_small_height
    override fun textMargin() = R.dimen.andes_badge_small_text_margin
    override fun cornerRadius() = R.dimen.andes_badge_small_corner_radius
}
