package com.example.mgckiosk.Menu.Product

import com.example.mgckiosk.AbstractMenu

class TeaPleasure() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[TeaPleasure MENU]\n" +
                    "1. 블루밍캐모마일      | ￦ 6.5 | 마음의 안정과 여유를 주는 은은하고 향긋한 캐모마일의 꽃향과 싱그러운 레몬그라스, 비타민C가 풍부한 사과를 블렌딩한 디카페인 캐모마일 블렌딩 티\n" +
                    "2. 프루티루이보스      | ￦ 6.5 | 무게감 있으면서도 개운하고 깔끔한 전세계 4% 클래식 등급 루이보스와 비타민C가 풍부한 제주도산 귤피, 전남 고흥산 유자를 블렌딩한 디카페인 루이보스 블렌딩 티\n" +
                    "3. 스위트히비스커스   ㅤ| ￦ 6.5 | 상큼한 히비스커스에 비타민C, 비타민E가 풍부한 레몬머틀과 달콤한 패션후르츠향, 천연 감미료 스테비아를 더해 새콤달콤하게 블렌딩한 디카페인 히비스커스 블렌딩 티\n" +
                    "4. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(4)
        when(menuNumber) {
            1 -> {}//teaPleasureBloomingChamomile()
            2 -> {}//teaPleasureFruityRooibos()
            3 -> {}//teaPleasureSweetHibiscus()
            4 -> back(this)
        }
    }
}