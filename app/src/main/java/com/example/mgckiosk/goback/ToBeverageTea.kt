package com.example.mgckiosk.goback

import com.example.mgckiosk.`interface`.GoBackOrEnd
import com.example.mgckiosk.sub.BeverageTea
import com.example.mgckiosk.exception.IllegalArgumentException

class ToBeverageTea : GoBackOrEnd {
    override fun goBackOrEnd() {
        println("1.뒤로가기 0. 종료")
        var option = IllegalArgumentException(1).selectNumber()
        when (option) {
            0 -> BeverageTea(-1).category()
            1 -> BeverageTea(0).category()
        }
    }
}