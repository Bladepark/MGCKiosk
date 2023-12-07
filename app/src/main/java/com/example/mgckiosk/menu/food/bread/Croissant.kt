package com.example.mgckiosk.menu.food.bread

import com.example.mgckiosk.AbstractMenu

class Croissant: AbstractMenu() {
    override var name: String = "크루아상"
    override var price: Double = 2.5
    val description: String = "바삭하고 부드러운 식감에 고소한 버터향을 가득 담은 베이커리 메뉴"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}