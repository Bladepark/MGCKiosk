package com.example.mgckiosk.menu.beverage.adeJuice

import com.example.mgckiosk.AbstractMenu

class CherryCoke : AbstractMenu() {
    val name: String = "체리콕"
    var price: Double = 3.3
    val description: String = "체리의 새콤함과 청량감을 동시에 즐길 수 있는 환상적인 에이드"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}