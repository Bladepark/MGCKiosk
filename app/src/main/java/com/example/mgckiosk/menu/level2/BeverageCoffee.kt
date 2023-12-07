package com.example.mgckiosk.menu.level2

import com.example.mgckiosk.menu.level3.HotCoffee
import com.example.mgckiosk.menu.level3.IcedCoffee
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu.level1.Beverage

class BeverageCoffee(override var category: Int) : AbstractMenu() {

    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 커피 ]")
            println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
            category = IllegalArgumentException(3).selectNumber()
        }
        when (category) {
            0 -> Beverage(-1).displayInfo()
            1 -> {
                println("[ 뜨거운 커피 상세 메뉴 ]")
                HotCoffee(0).displayInfo()
                goBackOrEnd(this)
            }

            2 -> {
                println("[ 차가운 커피 상세 메뉴 ]")
                IcedCoffee(0).displayInfo()
                goBackOrEnd(this)
            }

            3 -> Beverage(0).displayInfo()

        }
    }
}