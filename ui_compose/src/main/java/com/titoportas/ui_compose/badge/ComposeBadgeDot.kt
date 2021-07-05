package com.titoportas.ui_compose.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.titoportas.ui_compose.R
import com.titoportas.ui_compose.badge.type.AndesBadgeType

@Composable
fun ComposeBadgeDot(type: AndesBadgeType = AndesBadgeType.NEUTRAL) {
    Box(
        Modifier
            .size(dimensionResource(id = R.dimen.andes_badge_dot_size))
            .background(
                colorResource(
                    type.type.primaryColor().colorRes
                ), shape = CircleShape
            )
    )
}

@Preview(showBackground = true, name = "Compose Preview", backgroundColor = 11111111)
@Composable
fun ComposableBadgeDotPreview() {
    Column {
        ComposeBadgeDot(AndesBadgeType.ERROR)
        ComposeBadgeDot(AndesBadgeType.WARNING)
    }
}