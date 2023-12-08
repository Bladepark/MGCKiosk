package com.example.mgckiosk.menu2.bakery2

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.action.NumberOfItems
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.menu1.Bakery2

class Bread2(override var category: Int) : AbstractMenu() {

    override fun displayInfo() {
        var info = bread
        if (category == -1) {
            category = 0
        } else {
            println("")
            println("[ 빵 상세 메뉴 ]")
            println("")

            for (i in info.indices) {
                println("${i+1}. ${info.get(i).first} | ￦ ${info.get(i).second} | ${info.get(i).third}")
            }
            println("${info.size+1}. 뒤로가기")
            println("${info.size+2}. 장바구니 확인")
            println("${info.size+3}. 주문")
            println("0. 종료하기")

            category = IllegalArgumentException(info.size+3).selectNumber()
            NumberOfItems().numberOfItems(this, info, category)
        }
    }
}
