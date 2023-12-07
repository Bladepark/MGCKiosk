package com.example.mgckiosk.menu.beverage.coffee

import com.example.mgckiosk.AbstractMenu

class CaramelMacchiato: AbstractMenu() {
    override var name: String = "카라멜마끼아또"
    override var price: Double = 3.7
    val description: String = "폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}