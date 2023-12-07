package com.example.mgckiosk.menu.product

import com.example.mgckiosk.menu.product.sub.StickCoffee
import com.example.mgckiosk.abs.AbstractMenu

class ProductCoffeeStick(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 스틱커피 상세 메뉴 ]")
        StickCoffee(0).displayInfo()
        goBackOrEnd(this)
    }

}