package com.example.mgckiosk.menu.product.teapleasure

import com.example.mgckiosk.AbstractMenu

class TeaPleasureFruityRooibos: AbstractMenu() {
    override var name: String = "프루티루이보스"
    override var price: Double = 6.5
    val description: String = "무게감 있으면서도 개운하고 깔끔한 전세계 4% 클래식 등급 루이보스와 비타민C가 풍부한 제주도산 귤피, 전남 고흥산 유자를 블렌딩한 디카페인 루이보스 블렌딩 티"

    override fun displayInfo() {
        println("$name        | ￦ $price |  $description\n")
    }
}