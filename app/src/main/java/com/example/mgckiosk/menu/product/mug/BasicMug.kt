package com.example.mgckiosk.menu.product.mug

import com.example.mgckiosk.AbstractMenu

class BasicMug: AbstractMenu() {
    val name: String = "머그"
    var price: Double = 5.0
    val description: String = "일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그컵"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}