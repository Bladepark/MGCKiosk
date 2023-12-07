package com.example.mgckiosk

import java.lang.NullPointerException

interface IsValidMenuNumber {
    fun isValidMenuNumber(menuNumberSize:Int) : Int{
        while (true) {
            try {
                var menuNumber = readLine()!!.toInt()
                if (menuNumber in 1..menuNumberSize) return menuNumber
                else println("입력 오류! 1 ~ $menuNumberSize 안에 번호를 입력해주세요. ")
            } catch (e:NumberFormatException){
                println("입력 오류! 숫자를 입력해주세요.")
            } catch (e:NullPointerException){
                println("입력 오류! 숫자를 입력해주세요.")
            }
        }
    }
}