package com.example.mgckiosk.selection

import com.example.mgckiosk.abs.SelectCategory
import com.example.mgckiosk.sub.BakeryBread
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.sub.BakeryCookieMacaron
import com.example.mgckiosk.sub.BakeryCake

class Bakery(override var category: Int) : SelectCategory() {
    override fun category() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 베이커리 상세 카테고리 ]")
            println("1. 빵 2. 쿠키 & 마카롱 3. 케이크 4. 뒤로가기 0. 종료")
            category = IllegalArgumentException(4).selectNumber()
        }
        when (category) {
            1 -> BakeryBread(category).category()
            2 -> BakeryCookieMacaron(category).category()
            3 -> BakeryCake(category).category()
            4 -> Main(0).category()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}