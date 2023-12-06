package com.example.mgckiosk.menu.product.stickcoffee

import com.example.mgckiosk.AbstractMenu
import com.example.mgckiosk.menu.product.mug.MGCMug

class StickCoffee() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[StickCoffee MENU]\n" +
                    "1. 오리지날아메리카노           | ￦ 4.9 | 예가체프 원두의 레드와인을 연상케 하는 깊은 풍미, 화이트 초콜릿의 고급스런 단 맛에 풍부한 바디감을 더해 밸런스 잡힌 맛을 느낄 수 있는 아메리카노\n" +
                    "2. 디카페인아메리카노     ㅤ  ㅤ | ￦ 4.9 | 물의 삼투압을 이용한 독일 워터 프로세스 방식으로 카페인을 줄이고,브라질 원두 특유의 산미와 달콤함, 바디감은 고스란히 담아 조화로운 맛을 느낄 수 있는 아메리카노\n" +
                    "3. 스테비아믹스커피   ㅤ        | ￦ 5.9 | 무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고대체 감미료 스테비아로 당과 칼로리를 낮춰 부담 없이 달콤한 라떼의 맛을 즐길 수 있는 믹스커피\n" +
                    "4. 스테비아디카페인믹스커피      | ￦ 5.9 | 무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고 대체 감미료 스테비아로 당과 칼로리는 낮춘 디카페인임에도 밸런스 잡힌 스테비아 디카페인 믹스커피\n" +
                    "5. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(5)
        when(menuNumber) {
            1 -> {selectMenuItem(this, StickOriginalAmericano())}//stickOriginalAmericano()
            2 -> {selectMenuItem(this, StickDecafAmericano())}//stickDecafAmericano()
            3 -> {selectMenuItem(this, StickSteviaMixCoffee())}//stickSteviaMixCoffee()
            4 -> {selectMenuItem(this, StickSteviaDecafMixCoffee())}//stickSteviaDecafMixCoffee()
            5 -> back(this)
        }
    }
}