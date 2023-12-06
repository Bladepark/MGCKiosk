package com.example.mgckiosk.menu.food.cake

import com.example.mgckiosk.AbstractMenu

class OatmealPancake: AbstractMenu() {
    val name: String = "오트밀팬케이크"
    var price: Double = 4.5
    val description: String = "건강한 오트밀가루로 만든 팬케이크에 달콤한 메이플 시럽과 프레지덩 버터, 쥬에그 과일잼이 더해진 팬케이크"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}