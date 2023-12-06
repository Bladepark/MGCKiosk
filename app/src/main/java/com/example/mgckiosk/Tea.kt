package com.example.mgckiosk

class Tea(name: String,
          price: Int,
          explanation: String) : GoodsCommon(name, price, explanation){

    override fun displayInfo(){
        println("${name} | ${price} | 옵션- ")
    }
}