package com.example.mgckiosk

interface SelectMenuItem : IsValidMenuNumber, AddToCart{
    fun selectMenuItem(menuPage:AbstractMenu, menuItem: AbstractMenu) {
        menuItem.displayInfo()
        println(
            "위 메뉴를 장바구니에 추가 하시겠습니까?\n" +
            "1. 확인      2. 취소"
        )
        val menuNumber = isValidMenuNumber(2)
        if (menuNumber == 1) addToCart(menuItem)
        else {
            println("메뉴 추가를 취소하였습니다.")
            menuPage.displayInfo()
        }
    }
}