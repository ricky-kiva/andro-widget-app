package com.rickyslash.widgetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// Widget is a component to show information in Android's Home screen
// Type of widgets:
// - Information Widgets: shows important information time to time
// - Collection Widgets: shows many elements with same type (collection of email, collection of images, etc)
// - Control Widgets: control app's function directly
// - Hybrid Widgets: Combination of other type of widgets (music widget: shows information & control app)

// Things to consider in making widget:
// - Widget content: content of the widget
// - Widget navigation: addition navigation to app
// - Widget Resizing: add flexibility for user to resize the widget
// - Layout Considerations: flexibility in screen size
// - Widget Configuration: Add configuration before displaying the widget