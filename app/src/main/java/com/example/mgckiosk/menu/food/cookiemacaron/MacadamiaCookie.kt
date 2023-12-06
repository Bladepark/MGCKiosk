package com.example.mgckiosk.menu.food.cookiemacaron

import com.example.mgckiosk.AbstractMenu

class MacadamiaCookie: AbstractMenu() {
    val name: String = "마카다미아쿠키"
    var price: Double = 1.8
    val description: String = "고소한 마카다미아를 넣어 만든 메가MGC커피 시그니처 쿠키"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}