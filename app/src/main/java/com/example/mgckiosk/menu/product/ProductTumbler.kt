package com.example.mgckiosk.menu.product

import com.example.mgckiosk.menu.product.sub.Tumbler
import com.example.mgckiosk.abs.AbstractMenu

class ProductTumbler(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        println("[ 텀블러 상세 메뉴 ]")
        Tumbler(0).displayInfo()
        goBackOrEnd(this)
    }
}