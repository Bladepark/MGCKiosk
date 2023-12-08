package com.example.mgckiosk.action

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
class NumberOfItems {
    fun numberOfItems(className: AbstractMenu, info: List<Triple<String, Double, String>>, category: Int) {
        if (category == info.size+1) {
            className.displayInfo()
        } else if (category == 0) {
            println("프로그램을 종료합니다.")
        } else {
            println(
                "${category}. ${info.get(category-1).first} | ￦ ${info.get(category-1).second} | ${
                    info.get(
                        category-1
                    ).third
                }"
            )
            println("개수를 입력하세요. (최대 수량: 100개)")
            var unit = IllegalArgumentException(100).selectNumber()
            AddToBasket().addToBasket(className, this, info, category, unit)
        }
    }

}
