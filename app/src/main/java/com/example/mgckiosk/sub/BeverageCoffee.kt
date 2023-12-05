package com.example.mgckiosk.sub

import com.example.mgckiosk.goback.ToBeverageCoffee
import com.example.mgckiosk.item.HotCoffee
import com.example.mgckiosk.item.IcedCoffee
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.SelectCategory
import com.example.mgckiosk.selection.Beverage

class BeverageCoffee(override var category: Int) : SelectCategory() {

    override fun category() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 커피 ]")
            println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
            category = IllegalArgumentException(3).selectNumber()
        }
        when (category) {
            0 -> Beverage(-1).category()
            1 -> {
                println("[ 뜨거운 커피 상세 메뉴 ]")
                HotCoffee().item()
                ToBeverageCoffee().goBackOrEnd()
            }

            2 -> {
                println("[ 차가운 커피 상세 메뉴 ]")
                IcedCoffee().item()
                ToBeverageCoffee().goBackOrEnd()
            }

            3 -> Beverage(0).category()

        }
    }
}