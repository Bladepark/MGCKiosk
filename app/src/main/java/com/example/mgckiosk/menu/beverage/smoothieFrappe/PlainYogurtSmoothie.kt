package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu

class PlainYogurtSmoothie: AbstractMenu() {
    override var name: String = "플레인요거트스무디"
    override var price: Double = 3.9
    val description: String = "더 시원하게 요거트의 새콤달콤한 맛을 오롯이 만끽할 수 있는 스무디"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}