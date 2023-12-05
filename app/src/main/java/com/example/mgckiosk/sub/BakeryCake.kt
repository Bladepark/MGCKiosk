package com.example.mgckiosk.sub

import com.example.mgckiosk.item.Cake
import com.example.mgckiosk.goback.ToBakery
import com.example.mgckiosk.abs.SelectCategory

class BakeryCake(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 케이크 상세 메뉴 ]")
        Cake().item()
        ToBakery().goBackOrEnd()
    }
}