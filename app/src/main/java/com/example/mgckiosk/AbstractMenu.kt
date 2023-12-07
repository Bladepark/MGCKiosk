package com.example.mgckiosk

abstract class AbstractMenu(): SelectMenuItem, IsValidMenuNumber, Back{
    open var name:String = ""
    open var price: Double = 0.0

    abstract fun displayInfo()
}