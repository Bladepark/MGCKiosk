package com.example.mgckiosk.menu.product.sub

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.action.NumberOfItems
import com.example.mgckiosk.exception.IllegalArgumentException


class MugCup(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
        var info = mugCup
        if (category == -1) {
            category = 0
        } else {
            println("[ 머그컵 상세 메뉴 ]")
            println("")

            for (i in info.indices) {
                println("${i+1}. ${info.get(i).first} | ￦ ${info.get(i).second} | ${info.get(i).third}")
            }
            println("${info.size+1}. 뒤로가기")
            println("0. 종료하기")

            category = IllegalArgumentException(info.size).selectNumber()
            NumberOfItems().numberOfItems(this, info, category)
        }
    }
}