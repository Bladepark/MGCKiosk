package com.example.mgckiosk.selection


import com.example.mgckiosk.abs.SelectCategory
import com.example.mgckiosk.sub.BeverageCoffee
import com.example.mgckiosk.sub.BeverageTea
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.sub.BeverageAdeJuice
import com.example.mgckiosk.sub.BeverageSmoothieFrappe

class Beverage(override var category: Int) : SelectCategory() {
    override fun category() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 음료 상세 카테고리 ]")
            println("1. 커피 2. 티 3. 에이드/주스 4. 스무디/프라페 5. 뒤로가기 0. 종료")
            category = IllegalArgumentException(5).selectNumber()
        }
        when (category) {
            1 -> BeverageCoffee(0).category()
            2 -> BeverageTea(0).category()
            3 -> BeverageAdeJuice(category).category()
            4 -> BeverageSmoothieFrappe(category).category()
            5 -> Main(0).category()
            0 -> Main(-1).category()
        }
    }
}