package com.example.mgckiosk.`interface`

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.main
import com.example.mgckiosk.menu.level1.Bakery
import com.example.mgckiosk.menu.level1.Beverage
import com.example.mgckiosk.menu.Main
import com.example.mgckiosk.menu.level1.Product
import com.example.mgckiosk.menu.level2.BakeryBread
import com.example.mgckiosk.menu.level2.BakeryCake
import com.example.mgckiosk.menu.level2.BakeryCookieMacaron
import com.example.mgckiosk.menu.level2.BeverageAdeJuice
import com.example.mgckiosk.menu.level2.BeverageCoffee
import com.example.mgckiosk.menu.level2.BeverageSmoothieFrappe
import com.example.mgckiosk.menu.level2.BeverageTea
import com.example.mgckiosk.menu.level2.ProductCoffeeStick
import com.example.mgckiosk.menu.level2.ProductMugCup
import com.example.mgckiosk.menu.level2.ProductTea
import com.example.mgckiosk.menu.level2.ProductTumbler

interface GoBackOrEnd {
    fun goBackOrEnd(from: AbstractMenu) {

        println("1.뒤로가기 0. 종료")
        val OptionNumber:Int = IllegalArgumentException(2).selectNumber()

        when (OptionNumber) {
            0 -> Main(category = -1).displayInfo()
            1 -> {
                when (from) {
                    is Main -> main()
                    is Beverage, is Bakery, is Product -> Main(0)
                    is BeverageCoffee -> BeverageCoffee(0).displayInfo()
                    is BeverageTea -> BeverageTea(0).displayInfo()
                    is BeverageAdeJuice, is BeverageSmoothieFrappe -> Beverage(0).displayInfo()
                    is BakeryBread, is BakeryCake, is BakeryCookieMacaron -> Bakery(0).displayInfo()
                    is ProductMugCup, is ProductTumbler, is ProductCoffeeStick, is ProductTea -> Product(0).displayInfo()
                }
            }
        }
    }


}