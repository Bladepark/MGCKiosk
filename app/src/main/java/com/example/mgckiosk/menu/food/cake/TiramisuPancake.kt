package com.example.mgckiosk.menu.food.cake

import com.example.mgckiosk.AbstractMenu

class TiramisuPancake: AbstractMenu() {
    val name: String = "티라미수팬케이크"
    var price: Double = 4.5
    val description: String = "에스프레소의 향이 느껴지는 달콤한 팬케이크에 크리미한 크림이 가득 올라간 부드러운 티라미수 팬케이크"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}