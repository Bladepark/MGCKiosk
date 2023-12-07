package com.example.mgckiosk.menu.beverage.tea

import com.example.mgckiosk.AbstractMenu

class ApplecitronTea: AbstractMenu() {
    override var name: String = "사과유자차"
    override var price: Double = 3.5
    val description: String = "애플티의 향긋함과 유자청의 상큼달콤함을 한컵에 담아낸 과일티"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}