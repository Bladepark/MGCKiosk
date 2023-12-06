package com.example.mgckiosk

class Coffee(name: String,
             price: Int,
             explanation: String,
             var caffeination: String,
             var hotIce:String) : GoodsCommon(name, price, explanation) {

    override fun displayInfo() {
        println("${name} | ${price} | 옵션- 카페인:${caffeination}, ${hotIce}")
    }


}