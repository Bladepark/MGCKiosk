package com.example.mgckiosk.menu.beverage.tea

import com.example.mgckiosk.AbstractMenu

class EarlGrey: AbstractMenu() {
    override var name: String = "얼그레이"
    override var price: Double = 2.5
    val description: String = "홍차 특유의 풍부한 플레이버를 만끽할 수 있는 허브티"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}