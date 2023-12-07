package com.example.mgckiosk.menu.food.cookiemacaron

import com.example.mgckiosk.AbstractMenu

class CreamCheeseYakgwaCookie: AbstractMenu() {
    override var name: String = "뚱크림치즈약과쿠키"
    override var price: Double = 2.9
    val description: String = "쿠키 안에 바닐라맛 크림치즈 가득! 달달하고 꾸덕한 약과가 통째로 올라간 쫀득한 쿠키"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}