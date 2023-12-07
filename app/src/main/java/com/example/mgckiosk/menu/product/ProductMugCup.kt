package com.example.mgckiosk.menu.product

import com.example.mgckiosk.menu.product.sub.MugCup
import com.example.mgckiosk.abs.AbstractMenu

class ProductMugCup(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 머그컵 상세 메뉴 ]")
        MugCup(0).displayInfo()
        goBackOrEnd(this)
    }
}