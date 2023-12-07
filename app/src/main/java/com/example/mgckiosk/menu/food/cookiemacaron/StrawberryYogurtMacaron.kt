package com.example.mgckiosk.menu.food.cookiemacaron

import com.example.mgckiosk.AbstractMenu

class StrawberryYogurtMacaron: AbstractMenu() {
    override var name: String = "딸기요거트마카롱"
    override var price: Double = 1.8
    val description: String = "딸기요거트 스무디를 연상하게 하는 상큼한 마카롱"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}