package com.example.mgckiosk.menu.beverage.coffee

import com.example.mgckiosk.AbstractMenu

class VanillaLatte: AbstractMenu() {
    override var name: String = "바닐라라떼"
    override var price: Double = 3.4
    val description: String = "바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}
