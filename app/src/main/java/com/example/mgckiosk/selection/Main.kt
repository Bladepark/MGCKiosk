package com.example.mgckiosk.selection


import com.example.mgckiosk.abs.SelectCategory
import com.example.mgckiosk.main
import com.example.mgckiosk.exception.IllegalArgumentException

class Main(override var category: Int) : SelectCategory() {
    override fun category() {

        if (category == -1) {
            category = 0
        } else {
            println("[ 카테고리 ]")
            println("1. 음료 2. 베이커리 3. MD상품 4. 뒤로가기 0. 프로그램 종료")
            category = IllegalArgumentException(4).selectNumber()
        }
        when (category) {
            1 -> Beverage(category).category()
            2 -> Bakery(category).category()
            3 -> Product(category).category()
            4 -> main()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}