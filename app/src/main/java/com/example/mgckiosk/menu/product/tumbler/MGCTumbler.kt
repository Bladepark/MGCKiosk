package com.example.mgckiosk.menu.product.tumbler

import com.example.mgckiosk.AbstractMenu

class MGCTumbler: AbstractMenu() {
    val name: String = "와앙콘마요보름달빵"
    var price: Double = 7.0
    val description: String = "뛰어난 보온보냉력으로 하루종일 그대로, MGC 데일리 텀블러"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}