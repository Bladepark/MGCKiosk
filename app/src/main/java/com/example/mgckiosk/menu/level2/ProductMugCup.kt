package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.MugCup
import com.example.mgckiosk.abs.AbstractMenu

class ProductMugCup(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 머그컵 상세 메뉴 ]")
        MugCup(0).displayInfo()
        goBackOrEnd(this)
    }
}