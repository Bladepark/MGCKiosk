package com.example.mgckiosk.menu.food.cake

import com.example.mgckiosk.AbstractMenu
import com.example.mgckiosk.menu.food.bread.PizzaBread

class Cake() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Cake MENU]\n" +
                    "1. 몽쉘케이크        | ￦ 4.9 | 진하고 폭신한 초콜릿 스펀지 사이에 부드러운 생크림이 듬뿍 들어간 몽쉘 케이크\n" +
                    "2. 초코무스케익    ㅤ | ￦ 3.3 | 달콤한 초콜릿 본연의 맛을 더 진하게 느낄 수 있는 케이크\n" +
                    "3. 티라미수케익   ㅤ  | ￦ 3.3 | 부드러운 치즈 맛과 코코아의 조화로운 향으로 호불호 없이 즐기는 케이크\n" +
                    "4. 치즈케익          | ￦ 3.3 | 진한 치즈의 맛을 달콤하고 부드럽게 느낄 수 있는 케이크\n" +
                    "5. 오트밀팬케이크     | ￦ 4.5 | 건강한 오트밀가루로 만든 팬케이크에 달콤한 메이플 시럽과 프레지덩 버터, 쥬에그 과일잼이 더해진 팬케이크\n" +
                    "6. 티라미수팬케이크   | ￦ 4.5 | 에스프레소의 향이 느껴지는 달콤한 팬케이크에 크리미한 크림이 가득 올라간 부드러운 티라미수 팬케이크\n" +
                    "7. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(7)
        when(menuNumber) {
            1 -> {selectMenuItem(this, MonCherCreamCake())}
            2 -> {selectMenuItem(this, ChocolateMousseCake())}
            3 -> {selectMenuItem(this, TiramisuCake())}
            4 -> {selectMenuItem(this, CheeseCake())}
            5 -> {selectMenuItem(this, OatmealPancake())}
            6 -> {selectMenuItem(this, TiramisuPancake())}
            7 -> back(this)
        }
    }
}