package com.example.mgckiosk.menu.product.stickcoffee

import com.example.mgckiosk.AbstractMenu

class StickDecafAmericano: AbstractMenu() {
    override var name: String = "디카페인아메리카노"
    override var price: Double = 4.9
    val description: String = "물의 삼투압을 이용한 독일 워터 프로세스 방식으로 카페인을 줄이고,브라질 원두 특유의 산미와 달콤함, 바디감은 고스란히 담아 조화로운 맛을 느낄 수 있는 아메리카노"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}