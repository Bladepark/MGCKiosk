package com.example.mgckiosk.sub

import com.example.mgckiosk.item.Bread
import com.example.mgckiosk.goback.ToBakery
import com.example.mgckiosk.abs.SelectCategory

class BakeryBread(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 빵 상세 메뉴 ]")
        Bread().item()
        ToBakery().goBackOrEnd()
    }
}