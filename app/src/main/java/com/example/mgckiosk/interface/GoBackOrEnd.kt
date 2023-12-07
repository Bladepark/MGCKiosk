package com.example.mgckiosk.`interface`

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.main
import com.example.mgckiosk.menu.Bakery
import com.example.mgckiosk.menu.Beverage
import com.example.mgckiosk.menu.Main
import com.example.mgckiosk.menu.Product
import com.example.mgckiosk.menu.bakery.BakeryBread
import com.example.mgckiosk.menu.bakery.BakeryCake
import com.example.mgckiosk.menu.bakery.BakeryCookieMacaron
import com.example.mgckiosk.menu.beverage.BeverageAdeJuice
import com.example.mgckiosk.menu.beverage.BeverageCoffee
import com.example.mgckiosk.menu.beverage.BeverageSmoothieFrappe
import com.example.mgckiosk.menu.beverage.BeverageTea
import com.example.mgckiosk.menu.product.ProductCoffeeStick
import com.example.mgckiosk.menu.product.ProductMugCup
import com.example.mgckiosk.menu.product.ProductTea
import com.example.mgckiosk.menu.product.ProductTumbler

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