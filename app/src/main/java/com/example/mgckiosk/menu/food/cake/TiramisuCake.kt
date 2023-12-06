package com.example.mgckiosk.menu.food.cake

import com.example.mgckiosk.AbstractMenu

class TiramisuCake: AbstractMenu() {
    val name: String = "티라미수케익"
    var price: Double = 3.3
    val description: String = "부드러운 치즈 맛과 코코아의 조화로운 향으로 호불호 없이 즐기는 케이크"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}