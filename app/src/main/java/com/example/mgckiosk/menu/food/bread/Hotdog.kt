package com.example.mgckiosk.menu.food.bread

import com.example.mgckiosk.AbstractMenu

class Hotdog: AbstractMenu() {
    override var name: String = "핫도그"
    override var price: Double = 3.0
    val description: String = "부드러운 빵 속에 쫄깃한 소시지를 넣어 알찬 한입을 완성한 베이커리 메뉴"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}