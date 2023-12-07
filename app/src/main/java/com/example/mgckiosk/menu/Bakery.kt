package com.example.mgckiosk.menu

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu.bakery.BakeryBread
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.`interface`.GoBackOrEnd
import com.example.mgckiosk.menu.bakery.BakeryCookieMacaron
import com.example.mgckiosk.menu.bakery.BakeryCake

class Bakery(override var category:Int) : AbstractMenu(), GoBackOrEnd {
    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 베이커리 상세 카테고리 ]")
            println("1. 빵 2. 쿠키 & 마카롱 3. 케이크 4. 뒤로가기 0. 종료")
            category = IllegalArgumentException(4).selectNumber()
        }
        when (category) {
            1 -> BakeryBread(0).displayInfo()
            2 -> BakeryCookieMacaron(0).displayInfo()
            3 -> BakeryCake(0).displayInfo()
            4 -> Main(0).displayInfo()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}