package com.example.mgckiosk.menu.product.stickcoffee

import com.example.mgckiosk.AbstractMenu

class StickSteviaDecafMixCoffee: AbstractMenu() {
    override var name: String = "스테비아디카페인믹스커피"
    override var price: Double = 5.9
    val description: String = "무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고 대체 감미료 스테비아로 당과 칼로리는 낮춘 디카페인임에도 밸런스 잡힌 스테비아 디카페인 믹스커피"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}