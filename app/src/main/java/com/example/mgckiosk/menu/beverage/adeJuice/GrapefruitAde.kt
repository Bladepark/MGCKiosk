package com.example.mgckiosk.menu.beverage.adeJuice

import com.example.mgckiosk.AbstractMenu

class GrapefruitAde : AbstractMenu() {
    override var name: String = "자몽에이드"
    override var price: Double = 3.5
    val description: String = "자몽의 달콤쌉싸름한 맛과 탄산의 톡쏘는 목넘김이 어우러진 트로피컬 에이드"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}