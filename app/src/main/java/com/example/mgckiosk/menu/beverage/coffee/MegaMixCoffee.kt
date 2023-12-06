package com.example.mgckiosk.menu.beverage.coffee

import com.example.mgckiosk.AbstractMenu

class MegaMixCoffee : AbstractMenu() {
    val name: String = "왕할메가커피"
    var price: Double = 3.5
    val description: String = "우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 메가사이즈 커피 음료"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}