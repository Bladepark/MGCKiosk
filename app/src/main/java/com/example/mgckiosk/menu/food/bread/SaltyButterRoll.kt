package com.example.mgckiosk.menu.food.bread

import com.example.mgckiosk.AbstractMenu

class SaltyButterRoll: AbstractMenu() {
    val name: String = "버터버터소금빵"
    var price: Double = 2.5
    val description: String = "고소한 프랑스산 프레지덩 버터를 듬뿍넣어 더 부드럽고 짭쪼롬하게 즐길 수 있는 베이커리 메뉴"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}