package com.example.mgckiosk.sub

import com.example.mgckiosk.item.CookieMacaron
import com.example.mgckiosk.goback.ToBakery
import com.example.mgckiosk.abs.SelectCategory

class BakeryCookieMacaron(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 쿠키 & 마카롱 상세 메뉴 ]")
        CookieMacaron().item()
        ToBakery().goBackOrEnd()
    }
}