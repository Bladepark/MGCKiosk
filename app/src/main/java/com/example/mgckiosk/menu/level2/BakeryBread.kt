package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.Bread
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.`interface`.GoBackOrEnd

class BakeryBread(override var category: Int) : AbstractMenu(), GoBackOrEnd {
    override fun displayInfo() {
        println("[ 빵 상세 메뉴 ]")
        Bread(0).displayInfo()
        goBackOrEnd(this)
    }
}