package com.example.mgckiosk.Menu.Product

import com.example.mgckiosk.AbstractMenu

class Tumbler() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Tumbler MENU]\n" +
                    "1. MGC텀블러    ㅤ| ￦ 3.9 | 뛰어난 보온보냉력으로 하루종일 그대로, MGC 데일리 텀블러\n" +
                    "2. 텀블러     ㅤ  | ￦ 3.9 | 기능성과 비주얼을 다잡은 메가MGC커피 텀블러\n" +
                    "3. 뒤로가기"

        )
        var menuNumber = isValidMenuNumber(3)
        when(menuNumber) {
            1 -> {}//mgcTumbler()
            2 -> {}//basicTumbler()
            3 -> back(this)
        }
    }
}