package com.example.mgckiosk
//이 클래스는 쓰지 않음
class CaramelMacchiato (name: String, price: Int, explanation:String) : GoodsCommon(name, price, explanation) {

    override fun displayInfo(){
        println("폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피")
    }
}

class CondensedMilkLatte (name: String, price: Int, explanation:String) : GoodsCommon(name, price, explanation) {


    override fun displayInfo(){
        println("향기로운 에스프레소 샷, 부드러운 우유 그리고 달콤한 연유가 조화롭게 어우러진 라떼.")
    }
}

class HalmegaCoffee (name: String, price: Int, explanation:String) : GoodsCommon(name, price, explanation) {

    //
    override fun displayInfo(){
        println("우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 시원한 커피 음료")
    }
}

class HazelnutAmericano (name: String, price: Int, explanation:String) : GoodsCommon(name, price, explanation) {


    override fun displayInfo(){
        println("아메리카노에 헤이즐넛의 풍성한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피.")
    }
}

class TiramisuLatte (name: String, price: Int, explanation:String) : GoodsCommon(name, price, explanation) {


    override fun displayInfo(){
        println("에스프레소와 티라미수 소스 & 우유 그리고 풍미를 더해주는 달달한 크림까지 곁들여 완성한 티라미수 라떼.")
    }
}

class VanilaAmericano (name: String, price: Int, explanation:String) : GoodsCommon(name, price, explanation) {

    override fun displayInfo(){
        println("아메리카노에 바닐라의 부드러운 향과 달콤함을 조화롭게 담아낸 커피")
    }
}

class WanghalmegaCoffee (name: String, price: Int, explanation:String) : GoodsCommon(name, price, explanation) {


    override fun displayInfo(){
        println("우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 메가사이즈 커피 음료")
    }
}