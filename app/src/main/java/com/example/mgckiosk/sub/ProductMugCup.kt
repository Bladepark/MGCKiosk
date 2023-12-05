package com.example.mgckiosk.sub

import com.example.mgckiosk.goback.ToProduct
import com.example.mgckiosk.item.MugCup
import com.example.mgckiosk.abs.SelectCategory

class ProductMugCup(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 머그컵 상세 메뉴 ]")
        MugCup().item()
        ToProduct().goBackOrEnd()
    }
}