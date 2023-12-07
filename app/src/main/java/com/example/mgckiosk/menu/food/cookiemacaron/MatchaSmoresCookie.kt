package com.example.mgckiosk.menu.food.cookiemacaron

import com.example.mgckiosk.AbstractMenu

class MatchaSmoresCookie: AbstractMenu() {
    override var name: String = "말차스모어쿠키"
    override var price: Double = 2.9
    val description: String = "화이트 초코칩이 가득 박힌 말차 쿠키에 달콤하게 구운 마시멜로우를 얹어 달콤쌉싸름한 매력을 간직한 쿠키"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}