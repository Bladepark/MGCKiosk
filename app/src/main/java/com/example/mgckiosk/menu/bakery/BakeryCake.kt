package com.example.mgckiosk.menu.bakery

import com.example.mgckiosk.menu.bakery.sub.Cake
import com.example.mgckiosk.abs.AbstractMenu

class BakeryCake(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 케이크 상세 메뉴 ]")
        Cake(0).displayInfo()
        goBackOrEnd(this)
    }
}