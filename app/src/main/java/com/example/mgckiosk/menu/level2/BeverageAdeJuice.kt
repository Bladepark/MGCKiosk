package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.AdeJuice
import com.example.mgckiosk.abs.AbstractMenu

class BeverageAdeJuice(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 에이드/주스 상세 메뉴 ]")
        AdeJuice(0).displayInfo()

    }

}