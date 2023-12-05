package com.example.mgckiosk.sub

import com.example.mgckiosk.goback.ToBeverageTea
import com.example.mgckiosk.item.HotTea
import com.example.mgckiosk.item.IcedTea
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.abs.SelectCategory
import com.example.mgckiosk.selection.Beverage

class BeverageTea(override var category: Int) : SelectCategory() {
    override fun category() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 티 ]")
            println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
            category = IllegalArgumentException(3).selectNumber()
        }
        when (category) {
            0 -> Beverage(-1).category()
            1 -> {
                println("[ 뜨거운 티 상세 메뉴 ]")
                HotTea().item()
                ToBeverageTea().goBackOrEnd()
            }

            2 -> {
                println("[ 차가운 티 상세 메뉴 ]")
                IcedTea().item()
                ToBeverageTea().goBackOrEnd()
            }

            3 -> Beverage(0).category()

        }
    }
}