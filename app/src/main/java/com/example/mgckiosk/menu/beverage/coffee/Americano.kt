package com.example.mgckiosk.menu.beverage.coffee

import com.example.mgckiosk.AbstractMenu

class Americano : AbstractMenu() {
    val name: String = "아메리카노"
    var price: Double = 2.0
    val description: String = "메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}