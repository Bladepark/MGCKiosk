package com.example.mgckiosk

abstract class AbstractMenu(): SelectMenuItem, IsValidMenuNumber, Back {
    val menuList = ArrayList<AbstractMenu>()
    val orderList = ArrayList<AbstractMenu>()
    abstract fun displayInfo()
}