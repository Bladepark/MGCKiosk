package com.example.mgckiosk.menu.food.cookiemacaron

import com.example.mgckiosk.AbstractMenu

class UnicornFrappeMacaron: AbstractMenu() {
    val name: String = "유니콘프라페마카롱"
    var price: Double = 1.8
    val description: String = "메가커피 인기 음료인 유니콘 프라페를 모티브로 만든 매지컬 비주얼 마카롱"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}