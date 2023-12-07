package com.example.mgckiosk.`interface`

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.main
import com.example.mgckiosk.menu1.Bakery2
import com.example.mgckiosk.menu1.Beverage2
import com.example.mgckiosk.menu1.Main2
import com.example.mgckiosk.menu1.Product2
import com.example.mgckiosk.menu1.bakery.Bread2
import com.example.mgckiosk.menu1.bakery.Cake2
import com.example.mgckiosk.menu1.bakery.CookieMacaron2
import com.example.mgckiosk.menu1.beverage.AdeJuice2
import com.example.mgckiosk.menu1.beverage.Coffee2
import com.example.mgckiosk.menu1.beverage.SmoothieFrappe2
import com.example.mgckiosk.menu1.beverage.BeverageTea2
import com.example.mgckiosk.menu1.product.MugCup1
import com.example.mgckiosk.menu1.product.StickCoffee2
import com.example.mgckiosk.menu1.product.TeaProduct2
import com.example.mgckiosk.menu1.product.Tumbler2

interface GoBackOrEnd {
    fun goBackOrEnd(from: AbstractMenu) {

        println("1.뒤로가기 0. 종료")
        val OptionNumber:Int = IllegalArgumentException(2).selectNumber()

        when (OptionNumber) {
            0 -> Main2(category = -1).displayInfo()
            1 -> {
                when (from) {
                    is Main2 -> main()
                    is Beverage2, is Bakery2, is Product2 -> Main2(0)
                    is Coffee2 -> Coffee2(0).displayInfo()
                    is BeverageTea2 -> BeverageTea2(0).displayInfo()
                    is AdeJuice2, is SmoothieFrappe2 -> Beverage2(0).displayInfo()
                    is Bread2, is Cake2, is CookieMacaron2 -> Bakery2(0).displayInfo()
                    is MugCup1, is Tumbler2, is StickCoffee2, is TeaProduct2 -> Product2(0).displayInfo()
                }
            }
        }
    }


}