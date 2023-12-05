package com.example.mgckiosk.sub

import com.example.mgckiosk.goback.ToProduct
import com.example.mgckiosk.item.TeaProduct
import com.example.mgckiosk.abs.SelectCategory

class ProductTea(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 티상품 상세 메뉴 ]")
        TeaProduct().item()
        ToProduct().goBackOrEnd()
    }
}