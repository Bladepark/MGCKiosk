package com.example.mgckiosk

abstract class AbstractMenu(): SelectMenuItem, IsValidMenuNumber, Back, AddToCart {
    open var name:String = ""
    open var price: Double = 0.0
    val menuList = ArrayList<AbstractMenu>()
    val orderList = ArrayList<AbstractMenu>()
    abstract fun displayInfo()
}