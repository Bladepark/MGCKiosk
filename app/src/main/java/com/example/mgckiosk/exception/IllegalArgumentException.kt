package com.example.mgckiosk.exception

import com.example.mgckiosk.abs.SelectNumber
import java.lang.NumberFormatException

class IllegalArgumentException(optionNumber: Int) : SelectNumber(optionNumber) {
    override var optionNum = optionNumber
    override fun selectNumber():Int {
        var selectMenu = readLine()!!.toInt()
        try {

            when (selectMenu) {
                !in 0..optionNum -> {
                    println("숫자를 잘못 입력했습니다. 다시 입력해 주세요.")
                    selectMenu = IllegalArgumentException(optionNum).selectNumber()
                    return selectMenu
                }
                else -> return selectMenu
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해 주세요.")
        }


        return selectMenu
    }
}