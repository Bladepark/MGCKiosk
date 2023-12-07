package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu

class StrawberryPongCrush: AbstractMenu() {
    override var name: String = "딸기퐁크러쉬"
    override var price: Double = 3.9
    val description: String = "바삭하고 달달한 퐁에 상큼한 딸기와 부드러운 우유, 얼음을 함께 블렌딩해 시원하게 즐기는 프라페"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}