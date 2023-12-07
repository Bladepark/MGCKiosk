package com.example.mgckiosk.menu.beverage

import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu.Beverage
import com.example.mgckiosk.menu.beverage.sub.HotCoffee
import com.example.mgckiosk.menu.beverage.sub.IcedCoffee

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
                HotCoffee(0).displayInfo()
                goBackOrEnd(this)
            }

            2 -> {
                IcedCoffee(0).displayInfo()
                goBackOrEnd(this)
            }

            3 -> Beverage(0).displayInfo()

        }
    }
}