package com.example.mgckiosk.sub

import com.example.mgckiosk.item.AdeJuice
import com.example.mgckiosk.goback.ToBeverage
import com.example.mgckiosk.abs.SelectCategory

class BeverageAdeJuice(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 에이드/주스 상세 메뉴 ]")
        AdeJuice().item()
        ToBeverage().goBackOrEnd()
    }

}