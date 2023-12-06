package com.example.mgckiosk.menu.beverage.tea

import com.example.mgckiosk.AbstractMenu

class GreenTea: AbstractMenu() {
    val name: String = "녹차"
    var price: Double = 2.5
    val description: String = "고소한 감칠맛과 부드러운 목넘김으로 산뜻하게 마음을 위로하는 국내산 녹차"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}