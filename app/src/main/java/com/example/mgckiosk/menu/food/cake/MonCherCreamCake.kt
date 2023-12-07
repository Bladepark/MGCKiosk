package com.example.mgckiosk.menu.food.cake

import com.example.mgckiosk.AbstractMenu

class MonCherCreamCake: AbstractMenu() {
    override var name: String = "몽쉘케이크"
    override var price: Double = 4.9
    val description: String = "진하고 폭신한 초콜릿 스펀지 사이에 부드러운 생크림이 듬뿍 들어간 몽쉘 케이크"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}