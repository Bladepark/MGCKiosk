package com.example.mgckiosk.menu.food.bread

import com.example.mgckiosk.AbstractMenu

class CornMayoBread: AbstractMenu() {
    override var name: String = "와앙콘마요보름달빵"
    override var price: Double = 4.5
    val description: String = "톡톡 터지는 옥수수콘이 매력적인 와앙 큰 콘치즈마요 보름달빵"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}