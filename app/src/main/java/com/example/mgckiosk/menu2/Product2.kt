package com.example.mgckiosk.menu1

import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.action.ProceedToCheckOut
import com.example.mgckiosk.action.ShowBasket
import com.example.mgckiosk.menu1.product.MugCup1
import com.example.mgckiosk.menu1.product.StickCoffee2
import com.example.mgckiosk.menu1.product.TeaProduct2
import com.example.mgckiosk.menu1.product.Tumbler2

class Product2(override var category: Int) : AbstractMenu(){
    override fun displayInfo() {
        if (category == -1) {
            category = 6
        } else {
            println("[ MD 상품 상세 카테고리 ]")
            println("1. 머그컵 2. 텀블러 3. 스틱커피 4. 티상품 5. 뒤로가기 6. 장바구니 확인 7. 주문하기 0. 종료")
            category = IllegalArgumentException(7).selectNumber()
        }
        when (category) {
            1 -> MugCup1(0).displayInfo()
            2 -> Tumbler2(0).displayInfo()
            3 -> StickCoffee2(0).displayInfo()
            4 -> TeaProduct2(0).displayInfo()
            5 -> Main2(0).displayInfo()
            6 -> {
                ShowBasket(0).displayInfo()
                Product2(0).displayInfo()
            }
            7 -> ProceedToCheckOut().checkBalance(this)
            0 -> println("프로그램을 종료합니다.")
        }
    }
}