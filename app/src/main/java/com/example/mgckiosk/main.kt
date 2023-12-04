package com.example.mgckiosk

import kotlinx.coroutines.selects.select
import java.util.Objects

// 메가 커피 키오스크 팀 과제 3조 파이팅!!
fun main() {
    println("3조 파이팅")

    println("[홈페이지]")
    println("1. 메뉴 선택")
    var num = IllegalArgumentException(1).selectNumber() // 메인 화면으로 이동
    if (num == 1) {
        var main = MainCategory(-1).category()        // 카테고리 화면으로 이동
    }

}

// 카테고리 추상 클래스 ===============================================================================
abstract class Category(category: Int) {
    abstract var category: Int
    abstract fun category()
}

class MainCategory(category: Int) : Category(category) {
    override var category = category
    override fun category() {
        if (category == -1) {
            println("[카테고리]")
            println("1. 커피 2. 티 3. 에이드/주스 4. 디저트 5. 뒤로가기 0. 종료")
            category = IllegalArgumentException(6).selectNumber()
        }
        when (category) {
            1 -> Category1(category).category()
            2 -> Category2(category).category()
            3 -> Category3(category).category()
            4 -> Category4(category).category()
            5 -> main()
            6 -> println("프로그램을 종료합니다.")
        }
    }
}

class Category1(category: Int) : Category(category) {
    override var category = category
    override fun category() {
        println("[커피]")
        println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(4).selectNumber()
        when (option) {
            0 -> MainCategory(6).category()
            1 -> HotCoffee().item()
            2 -> IcedCoffee().item()
            3 -> MainCategory(-1).category()
        }
    }
}

class Category2(category: Int) : Category(category) {
    override var category = category
    override fun category() {
        println("[티]")
        println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(4).selectNumber()
        when (option) {
            0 -> MainCategory(6).category()
            1 -> HotTea().item()
            2 -> IcedTea().item()
            3 -> MainCategory(-1).category()
        }
    }
}

class Category3(category: Int) : Category(category) {
    override var category = category
    override fun category() {
        println("[에이드/주스]")
        AdeJuice().item()
        println("1. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(2).selectNumber()
        when (option) {
            0 -> MainCategory(6).category()
            1 -> MainCategory(-1).category()
        }
    }

}

class Category4(category: Int) : Category(category) {
    override var category = category
    override fun category() {
        println("[디저트]")
        Dessert().item()
        println("1. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(2).selectNumber()
        when (option) {
            0 -> MainCategory(6).category()
            1 -> MainCategory(-1).category()
        }
    }
}

// 화면 이동 추상 클래스 ==============================================================================
abstract class SelectNumber(optionNumber: Int) {
    abstract fun selectNumber(): Int
    abstract var optionNum: Int
}

class IllegalArgumentException(optionNumber: Int) : SelectNumber(optionNumber) {
    override var optionNum = optionNumber
    override fun selectNumber(): Int {
        var selectMenu: Int = readLine()!!.toInt()
        if (selectMenu !in 0..optionNum) {
            println("숫자를 잘못 입력했습니다. 다시 입력해 주세요.")
            IllegalArgumentException(optionNum).selectNumber()
        }
        return selectMenu
    }
}

// 음료 종류 추상 클래스 ==============================================================================

abstract class Item() {
    abstract fun item()
}

class HotCoffee : Item() {
    override fun item() {
        TODO("Not yet implemented")
    }

}

class IcedCoffee : Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class HotTea : Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class IcedTea : Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class AdeJuice : Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class Dessert : Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}

class GoBack : Item() {
    override fun item() {
        TODO("Not yet implemented")
    }
}