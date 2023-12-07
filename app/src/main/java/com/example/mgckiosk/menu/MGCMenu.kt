package com.example.mgckiosk.menu

import com.example.mgckiosk.AbstractMenu
import com.example.mgckiosk.menu.beverage.Beverage
import com.example.mgckiosk.menu.food.Food
import com.example.mgckiosk.menu.product.Product

import kotlin.system.exitProcess

class MGCMenu() : AbstractMenu(){
    override fun displayInfo() {
        println(
            "MEGA COFFEE 에 오신걸 환영합니다.\n" +
            "아래 메뉴판을 보시고 메뉴를 골라 해당하는 번호를 입력해주세요.\n\n" +
                    "[ MEGA COFFEE MENU ]\n" +
                    "1. Beverage    | 깊고 부드러운 커피 맛의 비밀 행복을 선사하는 다양한 음료\n" +
                    "2. Food        | 음료와 잘 어울리는 다양한 디저트\n" +
                    "3. Product     | 메가커피와 함께하는 데일리 굿즈\n" +
                    "4. exit\n\n" +
                    "[ ORDER MENU ]\n" +
                    "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                    "6. Cancel      | 진행중인 주문을 취소합니다.\n"
        )
        var menuNumber = isValidMenuNumber(6)
        when (menuNumber) {
            1 -> {
                val beverage = Beverage()
                beverage.displayInfo()
//                menuList.find { it == Beverage() }!!.displayInfo()
            }
            2 -> {
                val food = Food()
                food.displayInfo()
            }
            3 -> {
                val product = Product()
                product.displayInfo()
            }
            4 -> {println("프로그램을 종료합니다."); exitProcess(0)}
//        현재 잔액은 5.5W 으로 1.4W이 부족해서 주문할 수 없습니다.
            5 -> {
                if(orderList.isEmpty()){
                    println("장바구니가 비어있습니다. 메뉴를 추가한 후에 주문해주세요.")
                }else {
                    println(
                        "아래와 같이 주문 하시겠습니까?\n\n" +
                                "[Orders]\n"
                    )
                    orderList.forEach { println("${it.displayInfo()}") }
                    println("\n[Total]\n")
                    var totalPrice = orderList.map {
                        it.price
                    }.sum()
                    println("￦ $totalPrice")
                    println("\n\n1. 주문     2. 메뉴판")
                    var menuNumber = isValidMenuNumber(2)
                    when(menuNumber) {
                        1 -> {

                        }
                        2 -> {}
                    }
                }
            }
            6 -> {
                orderList.clear()
                println("장바구니를 비웠습니다. 메뉴를 추가한 후 다시 주문해주세요.")
            }
        }
    }
}