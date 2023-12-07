package com.example.mgckiosk.menu.product

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu.product.sub.TeaProduct

class ProductTea(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 티상품 상세 메뉴 ]")
        TeaProduct(0).displayInfo()
        goBackOrEnd(this)
    }
}