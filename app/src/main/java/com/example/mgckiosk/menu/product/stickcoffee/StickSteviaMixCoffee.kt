package com.example.mgckiosk.menu.product.stickcoffee

import com.example.mgckiosk.AbstractMenu

class StickSteviaMixCoffee: AbstractMenu() {
    override var name: String = "스테비아믹스커피"
    override var price: Double = 5.9
    val description: String = "무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고대체 감미료 스테비아로 당과 칼로리를 낮춰 부담 없이 달콤한 라떼의 맛을 즐길 수 있는 믹스커피"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}