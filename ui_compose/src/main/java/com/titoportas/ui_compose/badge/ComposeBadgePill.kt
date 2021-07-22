package com.titoportas.ui_compose.badge

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.semantics.customActions
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.titoportas.ui_compose.badge.border.AndesBadgePillBorder
import com.titoportas.ui_compose.badge.hierarchy.AndesBadgePillHierarchy
import com.titoportas.ui_compose.badge.size.AndesBadgePillSize
import com.titoportas.ui_compose.badge.type.AndesBadgeType

@Composable
fun ComposeBadgePill(pillHierarchy: AndesBadgePillHierarchy = AndesBadgePillHierarchy.LOUD,
                     type: AndesBadgeType = AndesBadgeType.NEUTRAL,
                     pillBorder: AndesBadgePillBorder = AndesBadgePillBorder.ROUNDED,
                     pillSize: AndesBadgePillSize = AndesBadgePillSize.SMALL,
                     text: String? = null) {
    Card(
        modifier = Modifier
            .defaultMinSize(
                dimensionResource(id = pillSize.size.height()),
                dimensionResource(id = pillSize.size.height())
            ),
        shape = RoundedCornerShape(
            topStart = dimensionResource(id = pillBorder.border.upStartCornerRadius(pillSize.size)),
            topEnd = dimensionResource(id = pillBorder.border.upEndCornerRadius(pillSize.size)),
            bottomEnd = dimensionResource(id = pillBorder.border.bottomEndCornerRadius(pillSize.size)),
            bottomStart = dimensionResource(id = pillBorder.border.bottomStartCornerRadius(pillSize.size))
        ),
        elevation = 0.dp,
        backgroundColor = colorResource(id = pillHierarchy.hierarchy.backgroundColor(type.type).colorRes),
    ) {
        Text(
            modifier = Modifier
                .wrapContentHeight(Alignment.CenterVertically)
                .padding(dimensionResource(id = pillSize.size.textMargin())),
            fontSize = with(LocalDensity.current) {
            dimensionResource(id = pillSize.size.textSize()).toSp()
            }, text = (text?:String()).toUpperCase(), color = colorResource(id = pillHierarchy.hierarchy.textColor(type.type).colorRes))
    }
}

@Preview(showBackground = true, name = "Compose Preview", backgroundColor = 0xFFFFFF)
@Composable
fun ComposeBadgePillPreview() {
    Column {
        ComposeBadgePill(text = "Buenas como va")
        Box(Modifier.padding(4.dp))
        ComposeBadgePill(pillHierarchy = AndesBadgePillHierarchy.QUIET, text = "Buenas como va")
        Box(Modifier.padding(4.dp))
        ComposeBadgePill(pillHierarchy = AndesBadgePillHierarchy.LOUD, pillSize = AndesBadgePillSize.SMALL, text = "Buenas como va")
        Box(Modifier.padding(4.dp))
        ComposeBadgePill(pillHierarchy = AndesBadgePillHierarchy.LOUD, pillSize = AndesBadgePillSize.LARGE, pillBorder = AndesBadgePillBorder.STANDARD, text = "Buenas como va")
        Box(Modifier.padding(4.dp))
        ComposeBadgePill(pillHierarchy = AndesBadgePillHierarchy.QUIET, pillSize = AndesBadgePillSize.LARGE, pillBorder = AndesBadgePillBorder.CORNER, type = AndesBadgeType.SUCCESS, text = "Buenas como va")
    }
}