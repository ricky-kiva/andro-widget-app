package com.rickyslash.widgetapp

import java.util.Random

// object for widget to give random number
internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random()
        return random.nextInt(max)
    }
}