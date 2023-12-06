package com.example.mgckiosk

class AdeJuice (name: String,
                price: Int,
                explanation: String,
                var ice:String,
                var soda:String) : GoodsCommon(name, price, explanation) {
    override fun displayInfo(){
        println("${name} | ${price}  | 옵션- ${ice}, ${soda}")
    }
}