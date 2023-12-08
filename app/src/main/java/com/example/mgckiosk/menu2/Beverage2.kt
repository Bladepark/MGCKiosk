package com.example.mgckiosk.menu1


import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.action.ProceedToCheckOut
import com.example.mgckiosk.action.ShowBasket
import com.example.mgckiosk.menu1.beverage.Coffee2
import com.example.mgckiosk.menu1.beverage.BeverageTea2
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.menu1.beverage.AdeJuice2
import com.example.mgckiosk.menu1.beverage.SmoothieFrappe2

class Beverage2(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 음료 상세 카테고리 ]")
            println("1. 커피 2. 티 3. 에이드/주스 4. 스무디/프라페 5. 뒤로가기 6. 장바구니 확인 7. 주문하기 0. 종료")
            category = IllegalArgumentException(7).selectNumber()
        }
        when (category) {
            1 -> Coffee2(0).displayInfo()
            2 -> BeverageTea2(0).displayInfo()
            3 -> AdeJuice2(0).displayInfo()
            4 -> SmoothieFrappe2(0).displayInfo()
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