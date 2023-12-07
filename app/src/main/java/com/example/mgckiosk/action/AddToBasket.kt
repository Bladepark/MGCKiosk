package com.example.mgckiosk.action

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.main

class AddToBasket {
    fun addToBasket(className: AbstractMenu, info: List<Triple<String, Double, String>>, category: Int, unit: Int) {
        println("이 메뉴를 장바구니에 추가하시겠습니까?")
        println("1. 확인 2. 취소")
        var confirm = IllegalArgumentException(info.size).selectNumber()
        when (confirm) {
            1 -> {
                Basket().saveData(info, category, unit)
                println("${info.get(category).first} ${unit}개가 장바구니에 추가되었습니다.")
                main()
            }
            0 -> className.displayInfo()
        }
    }
}