package com.example.mgckiosk.menu.product.teapleasure

import com.example.mgckiosk.AbstractMenu

class TeaPleasureSweetHibiscus: AbstractMenu() {
    override var name: String = "스위트히비스커스"
    override var price: Double = 6.5
    val description: String = "상큼한 히비스커스에 비타민C, 비타민E가 풍부한 레몬머틀과 달콤한 패션후르츠향, 천연 감미료 스테비아를 더해 새콤달콤하게 블렌딩한 디카페인 히비스커스 블렌딩 티"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}