package com.example.mgckiosk.menu.beverage.adeJuice

import com.example.mgckiosk.AbstractMenu

class BlueLemonAde : AbstractMenu() {
    override var name: String = "블루레몬에이드"
    override var price: Double = 3.5
    val description: String = "레몬에이드의 상큼한 청량감에 블루큐라소의 진한 향미를 더한 에이드"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}