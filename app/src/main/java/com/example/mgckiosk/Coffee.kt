package com.example.mgckiosk

class Coffee constructor(name: String, price: Int, explanation: String) {

    var name:String = name
    var price:Int = price
    var explanation:String = explanation
    fun displayInfo(){
        println("${name} ${price} ${explanation} coffee 클래스에서 생성됨")
    }
}