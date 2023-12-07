package com.example.mgckiosk.menu


import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.main
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.`interface`.GoBackOrEnd

class Main(override var category: Int) : AbstractMenu(), GoBackOrEnd {
    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 카테고리 ]")
            println("1. 음료 2. 베이커리 3. MD상품 4. 뒤로가기 0. 프로그램 종료")
            category = IllegalArgumentException(4).selectNumber()
        }
        when (category) {
            1 -> Beverage(category).displayInfo()
            2 -> Bakery(category).displayInfo()
            3 -> Product(category).displayInfo()
            4 -> Main(0).displayInfo()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}