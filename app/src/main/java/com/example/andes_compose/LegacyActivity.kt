package com.example.andes_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.titoportas.compose_interop.InteropBadgePill
import com.titoportas.ui_compose.badge.border.AndesBadgePillBorder
import com.titoportas.ui_compose.badge.type.AndesBadgeType

class LegacyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legacy)

        findViewById<InteropBadgePill>(R.id.interopPill).apply {
            text = "INTEROP"
            pillBorder = AndesBadgePillBorder.STANDARD
            type = AndesBadgeType.HIGHLIGHT
        }
    }
}