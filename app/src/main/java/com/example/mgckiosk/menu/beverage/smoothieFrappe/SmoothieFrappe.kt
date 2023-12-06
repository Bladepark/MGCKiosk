package com.example.mgckiosk.menu.beverage.smoothieFrappe

import com.example.mgckiosk.AbstractMenu
import com.example.mgckiosk.SelectMenuItem

class SmoothieFrappe() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Smoothie & Frappe MENU]\n" +
                    "1. 쿠키프라페           | ￦ 3.9 | 바삭하고 달콤한 오레오와 고소한 우유, 부드러운 바닐라향의 조화를 느낄 수 있는 프라페\n" +
                    "2. 녹차프라페     ㅤ  ㅤ | ￦ 3.9 | 향긋한 녹차 위에 우유와 휘핑크림을 더해 더 부드럽게 즐길 수 있는 프라페\n" +
                    "3. 플레인요거트스무디   ㅤ| ￦ 3.9 | 더 시원하게 요거트의 새콤달콤한 맛을 오롯이 만끽할 수 있는 스무디\n" +
                    "4. 딸기요거트스무디      | ￦ 3.9 | 요거트의 상큼함과 딸기의 상큼함을 상냥하게 어우른 상큼 스무디\n" +
                    "5. 망고요거트스무디      | ￦ 3.9 | 열대과일 망고의 진한 단 맛과 산뜻한 요거트의 하모니가 인상적인 스무디\n" +
                    "6. 딸기퐁크러쉬        ㅤ| ￦ 3.9 | 바삭하고 달달한 퐁에 상큼한 딸기와 부드러운 우유, 얼음을 함께 블렌딩해 시원하게 즐기는 프라페\n" +
                    "7. 초코허니퐁크러쉬      | ￦ 3.9 | 리얼 벌꿀이 들어가 더 달콤한 퍼프허니 시리얼과 부드럽게 달달한 초코가 함께 만드는 즐거운 맛의 프라페\n" +
                    "8. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(8)
        when(menuNumber) {
            1 -> {selectMenuItem(this, CookieFrappe())}
            2 -> {selectMenuItem(this, GreenTeaFrappe())}
            3 -> {selectMenuItem(this, PlainYogurtSmoothie())}
            4 -> {selectMenuItem(this, StrawberryYogurtSmoothie())}
            5 -> {selectMenuItem(this, MangoYogurtSmoothie())}
            6 -> {selectMenuItem(this, StrawberryPongCrush())}
            7 -> {selectMenuItem(this, ChocolateHoneyPongCrush())}
            8 -> back(this)
        }
    }
}