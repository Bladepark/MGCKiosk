package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu

class StrawberryYogurtSmoothie: AbstractMenu() {
    val name: String = "딸기요거트스무디"
    var price: Double = 3.9
    val description: String = "요거트의 상큼함과 딸기의 상큼함을 상냥하게 어우른 상큼 스무디"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}