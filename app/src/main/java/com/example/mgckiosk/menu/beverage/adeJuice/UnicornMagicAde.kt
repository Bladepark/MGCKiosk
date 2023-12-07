package com.example.mgckiosk.menu.beverage.adeJuice

import com.example.mgckiosk.AbstractMenu

class UnicornMagicAde : AbstractMenu() {
    override var name: String = "유니콘매직에이드"
    override var price: Double = 3.8
    val description: String = "섞으면 마법처럼 색이 변하는 재미에 라임의 청량함으로 입까지 즐거운 이색 에이드"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}