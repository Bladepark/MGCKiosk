package com.example.mgckiosk

interface AddToCart {
    fun addToCart(menuItem: AbstractMenu) {
        val orderList = ArrayList<AbstractMenu>()
        orderList.add(menuItem)
        println(" ${menuItem}가 장바구니에 추가되었습니다.")

    }
}