package com.example.mgckiosk

import com.example.mgckiosk.menu.MGCMenu
import com.example.mgckiosk.menu.beverage.Beverage
import com.example.mgckiosk.menu.beverage.adeJuice.AdeJuice
import com.example.mgckiosk.menu.beverage.coffee.Coffee
import com.example.mgckiosk.menu.beverage.smoothieFrappe.SmoothieFrappe
import com.example.mgckiosk.menu.beverage.tea.Tea
import com.example.mgckiosk.menu.food.Food
import com.example.mgckiosk.menu.food.bread.Bread
import com.example.mgckiosk.menu.food.cake.Cake
import com.example.mgckiosk.menu.food.cookiemacaron.CookieMacaron
import com.example.mgckiosk.menu.product.Product
import com.example.mgckiosk.menu.product.mug.Mug
import com.example.mgckiosk.menu.product.stickcoffee.StickCoffee
import com.example.mgckiosk.menu.product.teapleasure.TeaPleasure
import com.example.mgckiosk.menu.product.tumbler.Tumbler


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