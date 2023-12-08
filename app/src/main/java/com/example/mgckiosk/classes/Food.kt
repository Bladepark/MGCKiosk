package com.example.mgckiosk.classes

class Food(name: String,
           price: Int,
           explanation: String,
           var tableware :String) : GoodsCommon(name, price, explanation) {
    override fun displayInfo(){
        println("${name} | ${price} | ${explanation} | 옵션- 식기: ${tableware}")
    }
}