package com.example.mgckiosk.menu.level1

import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.`interface`.GoBackOrEnd
import com.example.mgckiosk.menu.Main
import com.example.mgckiosk.menu.level2.ProductMugCup
import com.example.mgckiosk.menu.level2.ProductTumbler
import com.example.mgckiosk.menu.level2.ProductCoffeeStick
import com.example.mgckiosk.menu.level2.ProductTea

class Product(override var category: Int) : AbstractMenu(), GoBackOrEnd {
    override fun displayInfo() {
        if (category == -1) {
            category = 6
        } else {
            println("[ MD 상품 상세 카테고리 ]")
            println("1. 머그컵 2. 텀블러 3. 스틱커피 4. 티상품 5. 뒤로가기 0. 종료")
            category = IllegalArgumentException(5).selectNumber()
        }
        when (category) {
            1 -> ProductMugCup(0).displayInfo()
            2 -> ProductTumbler(0).displayInfo()
            3 -> ProductCoffeeStick(0).displayInfo()
            4 -> ProductTea(0).displayInfo()
            5 -> Main(0).displayInfo()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}