package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.Cake
import com.example.mgckiosk.abs.AbstractMenu

class BakeryCake(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 케이크 상세 메뉴 ]")
        Cake(0).displayInfo()
        goBackOrEnd(this)
    }
}