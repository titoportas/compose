package com.titoportas.ui_compose.badge.border

import com.titoportas.ui_compose.R
import com.titoportas.ui_compose.badge.size.AndesBadgeSizeInterface


/**
 * Defines all borders related properties that an [AndesBadge] needs to be drawn properly.
 * Those properties change depending on the border of the badge.
 *
 */
internal interface AndesBadgeBorderInterface {

    /**
     * Returns a [Float] representing the up start corner radius to be used.
     *
     * @param size the size of the badge.
     * @param context needed for accessing some resources.
     * @return a [Float] representing the corner radius to be used.
     */
    fun upStartCornerRadius(size: AndesBadgeSizeInterface): Int = R.dimen.andes_badge_no_radius

    /**
     * Returns a [Float] representing the up end corner radius to be used.
     *
     * @param size the size of the badge.
     * @param context needed for accessing some resources.
     * @return a [Float] representing the corner radius to be used.
     */
    fun upEndCornerRadius(size: AndesBadgeSizeInterface): Int = R.dimen.andes_badge_no_radius

    /**
     * Returns a [Float] representing the bottom start corner radius to be used.
     *
     * @param size the size of the badge.
     * @param context needed for accessing some resources.
     * @return a [Float] representing the corner radius to be used.
     */
    fun bottomStartCornerRadius(size: AndesBadgeSizeInterface): Int = R.dimen.andes_badge_no_radius

    /**
     * Returns a [Float] representing the bottom end corner radius to be used.
     *
     * @param size the size of the badge.
     * @param context needed for accessing some resources.
     * @return a [Float] representing the corner radius to be used.
     */
    fun bottomEndCornerRadius(size: AndesBadgeSizeInterface): Int = R.dimen.andes_badge_no_radius

}

/**
 * Implementation of [AndesBadgeBorderInterface] that returns the required data but personalized for the Corner Border,
 * according to Andes specifications.
 *
 */
internal class AndesCornerBadgeBorder : AndesBadgeBorderInterface {

    override fun upEndCornerRadius(size: AndesBadgeSizeInterface) = size.cornerRadius()
    override fun bottomStartCornerRadius(size: AndesBadgeSizeInterface) = size.cornerRadius()
}

/**
 * Implementation of [AndesBadgeBorderInterface] that returns the required data but personalized for the Rounded Border,
 * according to Andes specifications.
 *
 */
internal class AndesRoundedBadgeBorder : AndesBadgeBorderInterface {

    override fun bottomStartCornerRadius(size: AndesBadgeSizeInterface) = size.cornerRadius()
}

/**
 * Implementation of [AndesBadgeBorderInterface] that returns the required data but personalized for the Standard Border,
 * according to Andes specifications.
 *
 */
internal class AndesStandardBadgeBorder : AndesBadgeBorderInterface {

    override fun upStartCornerRadius(size: AndesBadgeSizeInterface) = size.cornerRadius()
    override fun upEndCornerRadius(size: AndesBadgeSizeInterface) = size.cornerRadius()
    override fun bottomStartCornerRadius(size: AndesBadgeSizeInterface) = size.cornerRadius()
    override fun bottomEndCornerRadius(size: AndesBadgeSizeInterface) = size.cornerRadius()
}
