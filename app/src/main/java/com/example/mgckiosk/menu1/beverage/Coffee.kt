package com.example.mgckiosk.menu1.beverage

import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu1.Beverage2
import com.example.mgckiosk.menu1.beverage.sub.HotCoffee2
import com.example.mgckiosk.menu1.beverage.sub.IcedCoffee2

class Coffee(override var category: Int) : AbstractMenu() {

    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 커피 ]")
            println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
            category = IllegalArgumentException(3).selectNumber()
        }
        when (category) {
            0 -> Beverage2(-1).displayInfo()
            1 -> {
                HotCoffee2(0).displayInfo()
                goBackOrEnd(this)
            }
            2 -> {
                IcedCoffee2(0).displayInfo()
                goBackOrEnd(this)
            }
            3 -> Beverage2(0).displayInfo()
        }
    }
}