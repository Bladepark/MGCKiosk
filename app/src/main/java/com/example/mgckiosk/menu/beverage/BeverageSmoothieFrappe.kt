package com.example.mgckiosk.menu.beverage

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu.beverage.sub.SmoothieFrappe

class BeverageSmoothieFrappe(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 스무디/프라페 상세 메뉴 ]")
        SmoothieFrappe(0).displayInfo()
        goBackOrEnd(this)
    }

}