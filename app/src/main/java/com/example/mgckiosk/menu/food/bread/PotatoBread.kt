package com.example.mgckiosk.menu.food.bread

import com.example.mgckiosk.AbstractMenu

class PotatoBread: AbstractMenu() {
    val name: String = "감자빵"
    var price: Double = 3.5
    val description: String = "쫄깃한 빵 속 포슬포슬한 감자를 가득 담아낸 베이커리 메뉴"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}