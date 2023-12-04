package com.example.mgckiosk

import kotlinx.coroutines.selects.select

// 메가 커피 키오스크 팀 과제 3조 파이팅!!
fun main() {
    println("3조 파이팅")

    println("[홈페이지]")
    println("1. 메뉴 선택")
    IllegalArgumentException(1).selectNumber()

    println("[카테고리]")
    println("1. 커피 2. 티 3. 에이드/주스 4. 디저트")
    val category: Int = IllegalArgumentException(4).selectNumber()

    when (category) {
        1 -> {
            println("[커피]")
            println("1. Hot 2. Iced ")
            var coffeeOption = IllegalArgumentException(2).selectNumber()
            when (coffeeOption) {
                1 -> HotCoffee().item()
                2 -> IcedCoffee().item()
            }
        }
        2 -> {
            println("[티]")
            println("1. Hot 2. Iced ")
            var teaOption = IllegalArgumentException(2).selectNumber()
            when (teaOption) {
                1 -> HotTea().item()
                2 -> IcedTea().item()
            }
        }
        3 -> {
            AdeJuice().item()
        }
        4 -> {
            Dessert().item()
        }
    }
}


abstract class SelectNumber(optionNumber: Int) {
    abstract fun selectNumber(): Int
    abstract var optionNum: Int
}

abstract class Item() {
    abstract fun item()
}

class IllegalArgumentException(optionNumber: Int) : SelectNumber(optionNumber) {
    override var optionNum = optionNumber
    override fun selectNumber(): Int {
        var selectMenu:Int
        selectMenu = readLine()!!.toInt()
        try {
            if (selectMenu !in 1..optionNum) {
                println("숫자를 잘못 입력했습니다. 다시 입력해 주세요.")
                IllegalArgumentException(optionNum).selectNumber()
            }
            return selectMenu
        } catch (e: java.lang.NumberFormatException) {
            println("숫자를 잘못 입력했습니다. 다시 입력해 주세요.")
        } finally {
            IllegalArgumentException(optionNum).selectNumber()
        }

        return selectMenu
    }
}

class HotCoffee: Item() {
    override fun item() {
        TODO("Not yet implemented")
    }

}

class IcedCoffee: Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class HotTea: Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class IcedTea: Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class AdeJuice: Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class Dessert: Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class GoBack: Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}
