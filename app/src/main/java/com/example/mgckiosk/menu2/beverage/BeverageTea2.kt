package com.example.mgckiosk.menu1.beverage

import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.menu1.Beverage2
import com.example.mgckiosk.menu1.beverage.sub.HotTea2
import com.example.mgckiosk.menu1.beverage.sub.IcedTea2

class BeverageTea2(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 티 ]")
            println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
            category = IllegalArgumentException(3).selectNumber()
        }
        when (category) {
            0 -> Beverage2(-1).displayInfo()
            1 -> {
                HotTea2(0).displayInfo()
                goBackOrEnd(this)
            }

            2 -> {
                IcedTea2(0).displayInfo()
                goBackOrEnd(this)
            }

            3 -> Beverage2(0).displayInfo()

        }
    }
}