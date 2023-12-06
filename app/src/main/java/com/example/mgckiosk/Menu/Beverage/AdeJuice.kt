package com.example.mgckiosk.Menu.Beverage

import com.example.mgckiosk.AbstractMenu

class AdeJuice() : AbstractMenu(){
    override fun displayInfo() {
        println(
            "[Ade & Juice MENU]\n" +
                    "1. 메가에이드          | ￦ 3.9 | 상큼한 레몬, 상쾌한 라임, 달콤쌉싸름한 자몽의 3색 맛을 한데 어우른 메가MGC커피 시그니처 에이드\n" +
                    "2. 블루레몬에이드     ㅤ| ￦ 3.5 | 레몬에이드의 상큼한 청량감에 블루큐라소의 진한 향미를 더한 에이드\n" +
                    "3. 유니콘매직에이드     | ￦ 3.8 | 섞으면 마법처럼 색이 변하는 재미에 라임의 청량함으로 입까지 즐거운 이색 에이드\n" +
                    "4. 자몽에이드          | ￦ 3.5 | 자몽의 달콤쌉싸름한 맛과 탄산의 톡쏘는 목넘김이 어우러진 트로피컬 에이드\n" +
                    "5. 청포도에이드       ㅤ| ￦ 3.5 | 산뜻한 청포도와 상쾌한 탄산의 달달한 조화가 인상적인 에이드\n" +
                    "6. 라임모히또          | ￦ 3.8 | 상큼한 라임과 달콤한 향기의 애플민트가 어우러져 상쾌함을 한잔에 가득 채운 모히또 음료\n" +
                    "7. 체리콕             | ￦ 3.3 | 체리의 새콤함과 청량감을 동시에 즐길 수 있는 환상적인 에이드\n" +
                    "8. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(8)
        when(menuNumber) {
            1 -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }//megaAde()
            2 -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }//blueLemonAde()
            3 -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }//unicornMagicAde()
            4 -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }//grapefruitAde()
            5 -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }//greenGrapeAde()
            6 -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }//limeMojito()
            7 -> {
                val beverage = Beverage()
                beverage.displayInfo()
            }//cherryCoke()
            8 -> back(this)
        }
    }
}
