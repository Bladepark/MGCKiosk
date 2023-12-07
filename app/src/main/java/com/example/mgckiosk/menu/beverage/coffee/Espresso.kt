package com.example.mgckiosk.menu.beverage.coffee

import com.example.mgckiosk.AbstractMenu

class Espresso : AbstractMenu() {
    override var name: String = "에스프레소"
    override var price: Double = 1.5
    val description: String = "메가MGC커피 원두의 향미를 온전히 즐길 수 있는 에스프레소"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}