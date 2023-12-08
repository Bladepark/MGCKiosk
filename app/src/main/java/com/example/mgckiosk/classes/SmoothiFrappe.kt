package com.example.mgckiosk.classes

class SmoothiFrappe(name: String,
                    price: Int,
                    explanation: String,
                    var Sugar:String) : GoodsCommon(name, price, explanation){

    override fun displayInfo(){
        println("${name} | ${price} | ${explanation} | 옵션- 설탕양 ${Sugar} ")
    }
}