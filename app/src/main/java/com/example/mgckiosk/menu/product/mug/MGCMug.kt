package com.example.mgckiosk.menu.product.mug

import com.example.mgckiosk.AbstractMenu

class MGCMug: AbstractMenu() {
    override var name: String = "MGC머그"
    override var price: Double = 6.5
    val description: String = "귀여운 디테일로 소장가치를 더한 대용량 머그"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}