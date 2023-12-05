package com.example.mgckiosk.sub

import com.example.mgckiosk.goback.ToBeverage
import com.example.mgckiosk.item.SmoothieFrappe
import com.example.mgckiosk.abs.SelectCategory

class BeverageSmoothieFrappe(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 스무디/프라페 상세 메뉴 ]")
        SmoothieFrappe().item()
        ToBeverage().goBackOrEnd()
    }

}