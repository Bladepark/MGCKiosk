package com.example.mgckiosk.menu.beverage.adeJuice

import com.example.mgckiosk.AbstractMenu

class MegaAde : AbstractMenu() {
    override var name: String = "메가에이드"
    override var price: Double = 3.9
    val description: String = "상큼한 레몬, 상쾌한 라임, 달콤쌉싸름한 자몽의 3색 맛을 한데 어우른 메가MGC커피 시그니처 에이드"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}