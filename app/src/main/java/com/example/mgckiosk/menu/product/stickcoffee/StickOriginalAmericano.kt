package com.example.mgckiosk.menu.product.stickcoffee

import com.example.mgckiosk.AbstractMenu

class StickOriginalAmericano: AbstractMenu() {
    override var name: String = "오리지날아메리카노"
    override var price: Double = 4.9
    val description: String = "예가체프 원두의 레드와인을 연상케 하는 깊은 풍미, 화이트 초콜릿의 고급스런 단 맛에 풍부한 바디감을 더해 밸런스 잡힌 맛을 느낄 수 있는 아메리카노"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}