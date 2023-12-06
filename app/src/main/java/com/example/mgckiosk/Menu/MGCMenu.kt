package com.example.mgckiosk.Menu

import com.example.mgckiosk.AbstractMenu
import com.example.mgckiosk.Menu.Beverage.Beverage
import com.example.mgckiosk.Menu.Food.Food
import com.example.mgckiosk.Menu.Product.Product
import kotlin.system.exitProcess

class MGCMenu() : AbstractMenu(){
    override fun displayInfo() {
        println(
            "아래 메뉴판을 보시고 메뉴를 골라 해당하는 번호를 입력해주세요.\n\n" +
                    "[MEGA COFFEE MENU]\n" +
                    "1. Beverage    | 깊고 부드러운 커피 맛의 비밀 행복을 선사하는 다양한 음료\n" +
                    "2. Food        | 음료와 잘 어울리는 다양한 디저트\n" +
                    "3. Product     | 메가커피와 함께하는 데일리 굿즈\n" +
                    "4. exit"
        )
        var menuNumber = isValidMenuNumber(4)
        when (menuNumber) {
            1 -> {
                val beverage = Beverage()
                beverage.displayInfo()
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
        }
    }
}