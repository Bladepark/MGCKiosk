package com.example.mgckiosk.menu

import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.`interface`.GoBackOrEnd
import com.example.mgckiosk.menu.Main
import com.example.mgckiosk.menu.product.MugCup
import com.example.mgckiosk.menu.product.StickCoffee
import com.example.mgckiosk.menu.product.TeaProduct
import com.example.mgckiosk.menu.product.Tumbler

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
            1 -> MugCup(0).displayInfo()
            2 -> Tumbler(0).displayInfo()
            3 -> StickCoffee(0).displayInfo()
            4 -> TeaProduct(0).displayInfo()
            5 -> Main(0).displayInfo()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}