package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu

class MangoYogurtSmoothie: AbstractMenu() {
    val name: String = "망고요거트스무디"
    var price: Double = 3.9
    val description: String = "열대과일 망고의 진한 단 맛과 산뜻한 요거트의 하모니가 인상적인 스무디"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}