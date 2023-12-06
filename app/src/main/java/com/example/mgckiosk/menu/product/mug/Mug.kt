package com.example.mgckiosk.menu.product.mug

import com.example.mgckiosk.AbstractMenu
import com.example.mgckiosk.menu.food.cookiemacaron.CreamCheeseYakgwaCookie

class Mug() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Mug MENU]\n" +
                    "1. MGC머그   ㅤ | ￦ 6.5 | 귀여운 디테일로 소장가치를 더한 대용량 머그\n" +
                    "2. 머그     ㅤㅤ| ￦ 5.0 | 일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그컵\n" +
                    "3. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(3)
        when(menuNumber) {
            1 -> {selectMenuItem(this, MGCMug())}
            2 -> {selectMenuItem(this, BasicMug())}
            3 -> back(this)
        }
    }
}