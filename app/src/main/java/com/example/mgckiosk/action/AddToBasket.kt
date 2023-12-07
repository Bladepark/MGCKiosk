package com.example.mgckiosk.action

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.menu1.Main2

class AddToBasket {
    fun addToBasket(className: AbstractMenu, previousClass: NumberOfItems, info: List<Triple<String, Double, String>>, category: Int, unit: Int) {
        println("이 메뉴를 장바구니에 추가하시겠습니까?")
        println("1. 확인 2. 뒤로가기 3. 취소")
        var confirm = IllegalArgumentException(2).selectNumber()
        when (confirm) {
            1 -> {
                Basket().saveData(info, category, unit)
                println("${info.get(category).first} ${unit}개가 장바구니에 추가되었습니다.")
                Main2(0).displayInfo()
            }
            2 -> previousClass.numberOfItems(className, info, category)
            0 -> className.displayInfo()
        }
    }
}