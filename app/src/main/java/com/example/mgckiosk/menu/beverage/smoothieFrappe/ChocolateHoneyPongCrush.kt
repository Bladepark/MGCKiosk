package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu

class ChocolateHoneyPongCrush: AbstractMenu() {
    override var name: String = "초코허니퐁크러쉬"
    override var price: Double = 3.9
    val description: String = "리얼 벌꿀이 들어가 더 달콤한 퍼프허니 시리얼과 부드럽게 달달한 초코가 함께 만드는 즐거운 맛의 프라페"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}