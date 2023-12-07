package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.CookieMacaron
import com.example.mgckiosk.abs.AbstractMenu

class BakeryCookieMacaron(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 쿠키 & 마카롱 상세 메뉴 ]")
        CookieMacaron(0).displayInfo()
        goBackOrEnd(this)
    }
}