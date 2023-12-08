package com.example.mgckiosk.classes

open class GoodsCommon(name:String, price:Int, explanation:String) {

    var name:String = ""
    var price:Int = 0
    var explanation: String =""

    init {
        this.name = name
        this.price = price
        this.explanation=explanation
    }
    open fun displayInfo(){
        println("대충 맛과 향이 좋다는 설명")
    }
}