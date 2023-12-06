package com.example.mgckiosk.Menu.Beverage

import com.example.mgckiosk.AbstractMenu

open class Beverage() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Beverage MENU]\n" +
                    "1. Coffee          | 메가커피만의 깊고 부드러운 커피 맛의 비밀\n" +
                    "2. Tea             | 향긋함으로 산뜻하게 마음을 위로하는 차\n" +
                    "3. Ade&Juice       | 상콤&달콤&새콤 3콤보 에이드&주스\n" +
                    "4. Smoothie&Frappe | 과일과 토핑의 콜라보 부드러운데 찐한 스무디&프라\n" +
                    "5. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(5)
        when(menuNumber) {
            1 -> {
                val coffee = Coffee()
                coffee.displayInfo()
            }
            2 -> {
                val tea = Tea()
                tea.displayInfo()
            }
            3 -> {
                val adeJuice = AdeJuice()
                adeJuice.displayInfo()
            }
            4 -> {
                val smoothieFrappe = SmoothieFrappe()
                smoothieFrappe.displayInfo()
            }
            5 -> back(this)
        }
    }
}