package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.SmoothieFrappe
import com.example.mgckiosk.abs.AbstractMenu

class BeverageSmoothieFrappe(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 스무디/프라페 상세 메뉴 ]")
        SmoothieFrappe(0).displayInfo()
        goBackOrEnd(this)
    }

}