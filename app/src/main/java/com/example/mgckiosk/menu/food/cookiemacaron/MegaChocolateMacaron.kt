package com.example.mgckiosk.menu.food.cookiemacaron

import com.example.mgckiosk.AbstractMenu

class MegaChocolateMacaron: AbstractMenu() {
    override var name: String = "메가초코마카롱"
    override var price: Double = 1.8
    val description: String = "메가커피 시그니처 음료 메가초코를 모티브로 만든 초코맛 마카롱"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}