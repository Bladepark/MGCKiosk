package com.example.mgckiosk.menu.product

import com.example.mgckiosk.AbstractMenu
import com.example.mgckiosk.menu.product.mug.Mug
import com.example.mgckiosk.menu.product.stickcoffee.StickCoffee
import com.example.mgckiosk.menu.product.teapleasure.TeaPleasure
import com.example.mgckiosk.menu.product.tumbler.Tumbler

class Product() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Product MENU]\n" +
                    "1. Mug           | 일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그\n" +
                    "2. Tumbler       | 뛰어난 보온보냉력으로 하루종일 그대로, 기능성과 비주얼을 다잡은 메가MGC커피 텀블러\n" +
                    "3. StickCoffee   | 커피원두 원산지의 프로세스 방식으로 본 고장 커피 본연의 맛을 그대로 담은 스틱커피\n" +
                    "4. TeaPleasure   | 마음의 안정과 여유를 주는 은은하면서도 무게감있는 메가MGC만의 티플레저\n" +
                    "5. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(5)
        when(menuNumber) {
            1 -> {
                val mug = Mug()
                mug.displayInfo()
            }
            2 -> {
                val tumbler = Tumbler()
                tumbler.displayInfo()
            }
            3 -> {
                val stickCoffee = StickCoffee()
                stickCoffee.displayInfo()
            }
            4 -> {
                val teaPleasure = TeaPleasure()
                teaPleasure.displayInfo()
            }
            5 -> back(this)
        }
    }
}