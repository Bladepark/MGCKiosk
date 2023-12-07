package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu

class GreenTeaFrappe: AbstractMenu() {
    override var name: String = "녹차프라페"
    override var price: Double = 3.9
    val description: String = "향긋한 녹차 위에 우유와 휘핑크림을 더해 더 부드럽게 즐길 수 있는 프라페"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}