package com.example.mgckiosk

class Product(
    name:String,
    price:Int,
    explanation:String,
    var delivery :String
) :GoodsCommon(name,price,explanation) {
    override fun displayInfo(){
        println("${name} | ${price} | ${explanation} | 옵션- 배달장소: ${delivery}")
    }
}