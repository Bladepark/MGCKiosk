package com.example.mgckiosk.menu


import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu.beverage.Coffee
import com.example.mgckiosk.menu.beverage.BeverageTea
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.`interface`.GoBackOrEnd
import com.example.mgckiosk.menu.Main
import com.example.mgckiosk.menu.beverage.AdeJuice
import com.example.mgckiosk.menu.beverage.SmoothieFrappe

class Beverage(override var category: Int) : AbstractMenu(), GoBackOrEnd {
    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 음료 상세 카테고리 ]")
            println("1. 커피 2. 티 3. 에이드/주스 4. 스무디/프라페 5. 뒤로가기 0. 종료")
            category = IllegalArgumentException(5).selectNumber()
        }
        when (category) {
            1 -> Coffee(0).displayInfo()
            2 -> BeverageTea(0).displayInfo()
            3 -> AdeJuice(0).displayInfo()
            4 -> SmoothieFrappe(0).displayInfo()
            5 -> Main(0).displayInfo()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}