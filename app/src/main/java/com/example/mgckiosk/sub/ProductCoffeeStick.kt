package com.example.mgckiosk.sub

import com.example.mgckiosk.goback.ToProduct
import com.example.mgckiosk.item.StickCoffee
import com.example.mgckiosk.abs.SelectCategory

class ProductCoffeeStick(override var category: Int) : SelectCategory() {
    override fun category() {
        println("[ 스틱커피 상세 메뉴 ]")
        StickCoffee().item()
        ToProduct().goBackOrEnd()
    }

}