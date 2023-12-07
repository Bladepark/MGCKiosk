package com.example.mgckiosk.menu.product.teapleasure

import com.example.mgckiosk.AbstractMenu

class TeaPleasureBloomingChamomile: AbstractMenu() {
    override var name: String = "블루밍캐모마일"
    override var price: Double = 6.5
    val description: String = "마음의 안정과 여유를 주는 은은하고 향긋한 캐모마일의 꽃향과 싱그러운 레몬그라스, 비타민C가 풍부한 사과를 블렌딩한 디카페인 캐모마일 블렌딩 티"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description")
    }
}