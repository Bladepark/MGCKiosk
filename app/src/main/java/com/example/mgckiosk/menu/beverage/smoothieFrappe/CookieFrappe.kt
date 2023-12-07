package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu

class CookieFrappe: AbstractMenu() {
    override var name: String = "쿠키프라페"
    override var price: Double = 3.9
    val description: String = "바삭하고 달콤한 오레오와 고소한 우유, 부드러운 바닐라향의 조화를 느낄 수 있는 프라페"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}