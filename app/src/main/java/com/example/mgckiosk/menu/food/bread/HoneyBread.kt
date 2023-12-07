package com.example.mgckiosk.menu.food.bread

import com.example.mgckiosk.AbstractMenu

class HoneyBread: AbstractMenu() {
    override var name: String = "허니브레드"
    override var price: Double = 4.5
    val description: String = "바삭하고 쫄깃하게 구워낸 빵에 달콤한 크림을 올려 즐기는 조화로운 베이커리 메뉴"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}