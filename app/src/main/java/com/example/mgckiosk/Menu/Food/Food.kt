package com.example.mgckiosk.Menu.Food

import com.example.mgckiosk.AbstractMenu

class Food() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Food MENU]\n" +
                    "1. Bread           | 메가커피와 잘 어울리고 한끼로도 든든한 빵\n" +
                    "2. Cookie&Macaron  | 바삭하고 고소한 달달한 맛의 강자 쿠키와 마카롱\n" +
                    "3. Cake            | 부드럽고 진하게 달콤한 맛을 느낄 수 있는 케이크\n" +
                    "4. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(4)
        when(menuNumber) {
            1 -> {
                val bread = Bread()
                bread.displayInfo()
            }
            2 -> {
                val cookieMacaron = CookieMacaron()
                cookieMacaron.displayInfo()
            }
            3 -> {
                val cake = Cake()
                cake.displayInfo()
            }
            4 -> back(this)
        }
    }
}