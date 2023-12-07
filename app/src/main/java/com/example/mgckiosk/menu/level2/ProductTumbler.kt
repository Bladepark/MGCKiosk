package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.Tumbler
import com.example.mgckiosk.abs.AbstractMenu

class ProductTumbler(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 텀블러 상세 메뉴 ]")
        Tumbler(0).displayInfo()
        goBackOrEnd(this)
    }
}