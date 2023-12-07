package com.example.mgckiosk.abs

abstract class SelectNumber(optionNumber: Int)  {
    abstract fun selectNumber(): Int
    abstract var optionNum: Int
}