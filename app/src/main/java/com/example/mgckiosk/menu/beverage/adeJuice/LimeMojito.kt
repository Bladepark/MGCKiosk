package com.example.mgckiosk.menu.beverage.adeJuice

import com.example.mgckiosk.AbstractMenu

class LimeMojito : AbstractMenu() {
    override var name: String = "라임모히또"
    override var price: Double = 3.8
    val description: String = "상큼한 라임과 달콤한 향기의 애플민트가 어우러져 상쾌함을 한잔에 가득 채운 모히또 음료"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}