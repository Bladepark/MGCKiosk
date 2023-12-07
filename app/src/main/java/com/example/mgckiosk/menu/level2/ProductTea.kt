package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.TeaProduct
import com.example.mgckiosk.abs.AbstractMenu

class ProductTea(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 티상품 상세 메뉴 ]")
        TeaProduct(0).displayInfo()
        goBackOrEnd(this)
    }
}