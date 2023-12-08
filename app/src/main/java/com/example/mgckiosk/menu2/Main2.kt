package com.example.mgckiosk.menu1


import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.action.ProceedToCheckOut
import com.example.mgckiosk.action.ShowBasket
import com.example.mgckiosk.exception.IllegalArgumentException

class Main2(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 카테고리 ]")
            println("1. 음료 2. 베이커리 3. MD상품 4. 장바구니 확인 5. 주문하기 0. 프로그램 종료")
            category = IllegalArgumentException(6).selectNumber()
        }
        when (category) {
            1 -> Beverage2(category).displayInfo()
            2 -> Bakery2(category).displayInfo()
            3 -> Product2(category).displayInfo()
            4 -> {
                ShowBasket(0).displayInfo()
                Product2(0).displayInfo()
            }
            5 -> ProceedToCheckOut().checkBalance(this)
            0 -> println("프로그램을 종료합니다.")
        }
    }
}