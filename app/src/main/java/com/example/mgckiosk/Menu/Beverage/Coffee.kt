package com.example.mgckiosk.Menu.Beverage

import com.example.mgckiosk.AbstractMenu

class Coffee() : AbstractMenu(){
    override fun displayInfo() {
        println(
            "[Coffee MENU]\n" +
                    "1. 에스프레소        | ￦ 1.5 |  메가MGC커피 원두의 향미를 온전히 즐길 수 있는 에스프레소\n" +
                    "2. 아메리카노        | ￦ 2.0 |  메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피\n" +
                    "3. 왕할메가커피   ㅤㅤ| ￦ 3.5 |  우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 메가사이즈 커피 음료\n" +
                    "4. 카라멜마끼아또   ㅤ| ￦ 3.7 |  폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피\n" +
                    "5. 바닐라라떼        | ￦ 3.4 |  바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼\n" +
                    "6. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(6)
        when(menuNumber) {
            1 -> {}//espresso()
            2 -> {}//americano()
            3 -> {}//bigMixCoffee()
            4 -> {}//caramelMacchiato()
            5 -> {}//vanillaLatte()
            6 -> back(this)
        }
    }
}

// 리스트를 가져와야 한다. ["에스프레소        | ￦ 1.5 |  메가MGC커피 원두의 향미를 온전히 즐길 수 있는 에스프레소"]