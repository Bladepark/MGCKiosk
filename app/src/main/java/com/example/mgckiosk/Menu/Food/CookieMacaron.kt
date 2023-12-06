package com.example.mgckiosk.Menu.Food

import com.example.mgckiosk.AbstractMenu

class CookieMacaron() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Cookie & Macaron MENU]\n" +
                    "1. 뚱크림치즈약과쿠키   ㅤ| ￦ 2.9 | 쿠키 안에 바닐라맛 크림치즈 가득! 달달하고 꾸덕한 약과가 통째로 올라간 쫀득한 쿠키\n" +
                    "2. 말차스모어쿠키     ㅤㅤ| ￦ 2.9 | 화이트 초코칩이 가득 박힌 말차 쿠키에 달콤하게 구운 마시멜로우를 얹어 달콤쌉싸름한 매력을 간직한 쿠키\n" +
                    "3. 마카다미아쿠키   ㅤ  ㅤ| ￦ 1.8 | 고소한 마카다미아를 넣어 만든 메가MGC커피 시그니처 쿠키\n" +
                    "4. 초콜릿칩쿠키        ㅤ| ￦ 1.8 | 진한 초콜릿칩을 넣어 만든 메가MGC커피 시그니처 쿠키\n" +
                    "5. 딸기요거트마카롱   ㅤㅤ| ￦ 1.8 | 딸기요거트 스무디를 연상하게 하는 상큼한 마카롱\n" +
                    "6. 메가초코마카롱      ㅤ| ￦ 1.8 | 메가커피 시그니처 음료 메가초코를 모티브로 만든 초코맛 마카롱\n" +
                    "7. 유니콘프라페마카롱   ㅤ| ￦ 1.8 | 메가커피 인기 음료인 유니콘 프라페를 모티브로 만든 매지컬 비주얼 마카롱\n" +
                    "8. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(8)
        when(menuNumber) {
            1 -> {}//creamCheeseYakgwaCookie()
            2 -> {}//matchaSmoresCookie()
            3 -> {}//macadamiaCookie()
            4 -> {}//chocolateChipCookie()
            5 -> {}//strawberryYogurtMacaron()
            6 -> {}//megaChocolateMacaron()
            7 -> {}//unicornFrappeMacaron()
            8 -> back(this)
        }
    }
}