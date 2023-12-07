package com.example.mgckiosk.menu.beverage.adeJuice

import com.example.mgckiosk.AbstractMenu

class GreenGrapeAde : AbstractMenu() {
    override var name: String = "청포도에이드"
    override var price: Double = 3.5
    val description: String = "산뜻한 청포도와 상쾌한 탄산의 달달한 조화가 인상적인 에이드"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}