package com.example.mgckiosk.`interface`

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.main
import com.example.mgckiosk.menu.Bakery
import com.example.mgckiosk.menu.Beverage
import com.example.mgckiosk.menu.Main
import com.example.mgckiosk.menu.Product
import com.example.mgckiosk.menu.bakery.Bread
import com.example.mgckiosk.menu.bakery.Cake
import com.example.mgckiosk.menu.bakery.CookieMacaron
import com.example.mgckiosk.menu.beverage.AdeJuice
import com.example.mgckiosk.menu.beverage.Coffee
import com.example.mgckiosk.menu.beverage.SmoothieFrappe
import com.example.mgckiosk.menu.beverage.BeverageTea
import com.example.mgckiosk.menu.product.MugCup
import com.example.mgckiosk.menu.product.StickCoffee
import com.example.mgckiosk.menu.product.TeaProduct
import com.example.mgckiosk.menu.product.Tumbler

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
                    is Coffee -> Coffee(0).displayInfo()
                    is BeverageTea -> BeverageTea(0).displayInfo()
                    is AdeJuice, is SmoothieFrappe -> Beverage(0).displayInfo()
                    is Bread, is Cake, is CookieMacaron -> Bakery(0).displayInfo()
                    is MugCup, is Tumbler, is StickCoffee, is TeaProduct -> Product(0).displayInfo()
                }
            }
        }
    }


}