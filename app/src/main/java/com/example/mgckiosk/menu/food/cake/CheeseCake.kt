package com.example.mgckiosk.menu.food.cake

import com.example.mgckiosk.AbstractMenu

class CheeseCake: AbstractMenu() {
    val name: String = "치즈케익"
    var price: Double = 3.3
    val description: String = "진한 치즈의 맛을 달콤하고 부드럽게 느낄 수 있는 케이크"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}