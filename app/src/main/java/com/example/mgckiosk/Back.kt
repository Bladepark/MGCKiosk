package com.example.mgckiosk

import com.example.mgckiosk.Menu.MGCMenu
import com.example.mgckiosk.Menu.Beverage.*
import com.example.mgckiosk.Menu.Food.*
import com.example.mgckiosk.Menu.Product.*


interface Back {
    fun back(menuPage:AbstractMenu) {
        when(menuPage) {
            is Beverage, is Food, is Product -> {
                val mgcMenu = MGCMenu()
                mgcMenu.displayInfo()
            }
            is Coffee, is AdeJuice, is SmoothieFrappe, is Tea -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }
            is Bread, is CookieMacaron, is Cake -> {
                val food = Food()
                food.displayInfo()
            }
            is Mug, is Tumbler, is StickCoffee, is TeaPleasure -> {
                val product = Product()
                product.displayInfo()
            }
        }
    }
}