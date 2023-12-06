package com.example.mgckiosk.menu.beverage.tea

import com.example.mgckiosk.AbstractMenu

class Chamomile: AbstractMenu() {
    val name: String = "캐모마일"
    var price: Double = 2.5
    val description: String = "마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}