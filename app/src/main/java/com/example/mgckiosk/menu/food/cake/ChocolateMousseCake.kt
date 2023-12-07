package com.example.mgckiosk.menu.food.cake

import com.example.mgckiosk.AbstractMenu

class ChocolateMousseCake: AbstractMenu() {
    override var name: String = "초코무스케익"
    override var price: Double = 3.3
    val description: String = "달콤한 초콜릿 본연의 맛을 더 진하게 느낄 수 있는 케이크"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}