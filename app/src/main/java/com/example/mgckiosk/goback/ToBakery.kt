package com.example.mgckiosk.goback

import com.example.mgckiosk.`interface`.GoBackOrEnd
import com.example.mgckiosk.selection.Bakery
import com.example.mgckiosk.exception.IllegalArgumentException


class ToBakery : GoBackOrEnd {
    override fun goBackOrEnd() {
        println("1.뒤로가기 0. 종료")
        var option = IllegalArgumentException(2).selectNumber()
        when (option) {
            0 -> Bakery(-1).category()
            1 -> Bakery(0).category()
        }
    }
}