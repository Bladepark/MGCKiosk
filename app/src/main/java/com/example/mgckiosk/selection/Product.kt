package com.example.mgckiosk.selection

import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.SelectCategory
import com.example.mgckiosk.sub.ProductMugCup
import com.example.mgckiosk.sub.ProductTumbler
import com.example.mgckiosk.sub.ProductCoffeeStick
import com.example.mgckiosk.sub.ProductTea

class Product(override var category: Int) : SelectCategory() {
    override fun category() {
        if (category == -1) {
            category = 6
        } else {
            println("[ MD 상품 상세 카테고리 ]")
            println("1. 머그컵 2. 텀블러 3. 스틱커피 4. 티상품 5. 뒤로가기 0. 종료")
            category = IllegalArgumentException(5).selectNumber()
        }
        when (category) {
            1 -> ProductMugCup(category).category()
            2 -> ProductTumbler(category).category()
            3 -> ProductCoffeeStick(category).category()
            4 -> ProductTea(category).category()
            5 -> Main(0).category()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}