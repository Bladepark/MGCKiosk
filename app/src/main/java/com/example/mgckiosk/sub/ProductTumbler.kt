package com.example.mgckiosk.sub

import com.example.mgckiosk.goback.ToProduct
import com.example.mgckiosk.item.Tumbler
import com.example.mgckiosk.abs.SelectCategory

class ProductTumbler(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 텀블러 상세 메뉴 ]")
        Tumbler().item()
        ToProduct().goBackOrEnd()
    }
}