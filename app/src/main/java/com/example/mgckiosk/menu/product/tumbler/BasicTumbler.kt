package com.example.mgckiosk.menu.product.tumbler

import com.example.mgckiosk.AbstractMenu

class BasicTumbler: AbstractMenu() {
    val name: String = "텀블러"
    var price: Double = 6.5
    val description: String = "기능성과 비주얼을 다잡은 메가MGC커피 텀블러"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}