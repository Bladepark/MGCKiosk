package com.example.mgckiosk

interface IsValidNumber {
    fun isValidNum(size:Int):Int {
        while (true) {
            try {
                var num = readln().toInt()
                if (num in 1..size) return num
                else println("입력 오류! 1 ~ ${size} 안에 번호를 입력해주세요. ")
            } catch (e: NumberFormatException) {
                println("숫자를 입력해주세요.")
            }
        }
    }
}