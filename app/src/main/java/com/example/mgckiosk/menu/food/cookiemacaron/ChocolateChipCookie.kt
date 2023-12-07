package com.example.mgckiosk.menu.food.cookiemacaron

import com.example.mgckiosk.AbstractMenu

class ChocolateChipCookie: AbstractMenu() {
    override var name: String = "초콜릿칩쿠키"
    override var price: Double = 1.8
    val description: String = "진한 초콜릿칩을 넣어 만든 메가MGC커피 시그니처 쿠키"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}