package com.example.mgckiosk.goback

import com.example.mgckiosk.`interface`.GoBackOrEnd
import com.example.mgckiosk.sub.BeverageCoffee
import com.example.mgckiosk.exception.IllegalArgumentException

class ToBeverageCoffee : GoBackOrEnd {
    override fun goBackOrEnd() {
        println("1.뒤로가기 0. 종료")
        var option = IllegalArgumentException(1).selectNumber()
        when (option) {
            0 -> BeverageCoffee(-1).category()
            1 -> BeverageCoffee(0).category()
        }
    }
}