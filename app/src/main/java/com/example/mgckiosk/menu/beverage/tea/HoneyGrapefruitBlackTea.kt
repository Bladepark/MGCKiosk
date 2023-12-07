package com.example.mgckiosk.menu.beverage.tea

import com.example.mgckiosk.AbstractMenu

class HoneyGrapefruitBlackTea: AbstractMenu() {
    override var name: String = "허니자몽블랙티ㅤ"
    override var price: Double = 3.7
    val description: String = "달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}