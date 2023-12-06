package com.example.mgckiosk.menu.food.bread

import com.example.mgckiosk.AbstractMenu

class PizzaBread: AbstractMenu() {
    val name: String = "와앙피자보름달빵"
    var price: Double = 4.5
    val description: String = "한끼로도 든든한 중독적인 추억의 와앙 큰 소시지 피자빵"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}