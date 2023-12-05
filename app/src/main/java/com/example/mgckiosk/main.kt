package com.example.mgckiosk

import kotlinx.coroutines.selects.select
import java.util.Locale.Category
import java.util.Objects

fun main() {
    println("3조 파이팅")

    println("[ 홈페이지 ]")
    println("1. 메뉴 선택")
    var num = IllegalArgumentException(1).selectNumber() // 메인 화면으로 이동
    if (num == 1) {
        var main = MainCategory(0).category()        // 카테고리 화면으로 이동
    }

}

// 카테고리 선택 추상 클래스
abstract class SelectCategory(category: Int) {
    abstract var category: Int
    abstract fun category()
}

// 메인 카테고리 선택 실행 클래스

class MainCategory(category: Int) : SelectCategory(category) {
    override var category: Int = category
    override fun category() {

        if (category == -1) {
            category = 0
        } else {
            println("[ 카테고리 ]")
            println("1. 음료 2. 베이커리 3. MD상품 4. 뒤로가기 0. 프로그램 종료")
            category = IllegalArgumentException(4).selectNumber()
        }
        when (category) {
            1 -> BeverageCategory(category).category()
            2 -> BakeryCategory(category).category()
            3 -> ProductCategory(category).category()
            4 -> main()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}


// 음료 카테고리 선택 실행 클래스 ===============================================================================

class BeverageCategory(override var category: Int) : SelectCategory(category) {
    override fun category() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 음료 상세 카테고리 ]")
            println("1. 커피 2. 티 3. 에이드/주스 4. 스무디/프라페 5. 뒤로가기 0. 종료")
            category = IllegalArgumentException(5).selectNumber()
        }
        when (category) {
            1 -> BeverageSubCategory1(0).category()
            2 -> BeverageSubCategory2(0).category()
            3 -> BeverageSubCategory3(category).category()
            4 -> BeverageSubCategory4(category).category()
            5 -> MainCategory(0).category()
            0 -> MainCategory(-1).category()
        }
    }
}

// 음료 카테고리 Hot Ice 선택 클래스

class BeverageSubCategory1(override var category: Int) : SelectCategory(category) {

    override fun category() {
        println("[ 커피 ]")
        println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(3).selectNumber()
        when (option) {
            0 -> BeverageCategory(-1).category()
            1 -> {
                println("[ 뜨거운 커피 상세 메뉴 ]")
                HotCoffee().item()
                println("1. 뒤로가기 0. 종료")
                var option = IllegalArgumentException(1).selectNumber()
                when (option) {
                    0 -> BeverageCategory(-1).category()
                    1 -> BeverageCategory(0).category()
                }
            }

            2 -> {
                println("[ 차가운 커피 상세 메뉴 ]")
                IcedCoffee().item()
                println("1. 뒤로가기 0. 종료")
                var option = IllegalArgumentException(1).selectNumber()
                when (option) {
                    0 -> BeverageCategory(-1).category()
                    1 -> BeverageCategory(0).category()
                }
            }

            3 -> BeverageCategory(0).category()

        }
    }
}

class BeverageSubCategory2(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 티 ]")
        println("1. Hot 2. Iced 3. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(3).selectNumber()
        when (option) {
            0 -> BeverageCategory(-1).category()
            1 -> {
                println("[ 뜨거운 티 상세 메뉴 ]")
                HotTea().item()
                println("1. 뒤로가기 0. 종료")
                var option = IllegalArgumentException(1).selectNumber()
                when (option) {
                    0 -> BeverageCategory(-1).category()
                    1 -> BeverageCategory(0).category()
                }
            }

            2 -> {
                println("[ 차가운 티 상세 메뉴 ]")
                IcedTea().item()
                println("1. 뒤로가기 0. 종료")
                var option = IllegalArgumentException(1).selectNumber()
                when (option) {
                    0 -> BeverageCategory(-1).category()
                    1 -> BeverageCategory(0).category()
                }
            }

            3 -> BeverageCategory(0).category()

        }
    }
}

class BeverageSubCategory3(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 에이드/주스 ]")
        AdeJuice().item()
        println("1. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(1).selectNumber()
        when (option) {
            0 -> BeverageCategory(-1).category()
            1 -> BeverageCategory(0).category()
        }
    }

}

class BeverageSubCategory4(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 스무디/프라페 ]")
        SmoothieFrappe().item()
        println("1. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(1).selectNumber()
        when (option) {
            0 -> BeverageCategory(-1).category()
            1 -> BeverageCategory(0).category()
        }
    }
}

// 베이커리 카테고리 화면 =================================================================================
class BakeryCategory(override var category: Int) : SelectCategory(category) {
    override fun category() {
        if (category == -1) {
            category = 0
        } else {
            println("[ 베이커리 상세 카테고리 ]")
            println("1. 빵 2. 쿠키 & 마카롱 3. 케이크 4. 뒤로가기 0. 종료")
            category = IllegalArgumentException(4).selectNumber()
        }
        when (category) {
            1 -> BakerySubCategory1(category).category()
            2 -> BakerySubCategory2(category).category()
            3 -> BakerySubCategory3(category).category()
            4 -> MainCategory(0).category()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}

class BakerySubCategory1(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 빵 ]")
        println("1. 뒤로가기 0. 종료")
        Bread().item()
        category = IllegalArgumentException(1).selectNumber()
        when (category) {
            0 -> BeverageCategory(-1).category()
            1 -> BeverageCategory(0).category()
        }
    }
}

class BakerySubCategory2(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 쿠키 & 마카롱 ]")
        println("1. 뒤로가기 0. 종료")
        CookieMacaron().item()
        category = IllegalArgumentException(1).selectNumber()
        when (category) {
            0 -> BakeryCategory(-1).category()
            1 -> BakeryCategory(0).category()
        }
    }
}

class BakerySubCategory3(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 케이크 ]")
        println("1. 뒤로가기 0. 종료")
        Cake().item()
        category = IllegalArgumentException(3).selectNumber()
        when (category) {
            0 -> BakeryCategory(-1).category()
            1 -> BakeryCategory(0).category()
        }
    }
}


// MD 상품 카테고리 화면 =================================================================================
class ProductCategory(override var category: Int) : SelectCategory(category) {
    override fun category() {
        if (category == -1) {
            category = 6
        } else {
            println("[ MD 상품 상세 카테고리 ]")
            println("1. 머그컵 2. 텀블러 3. 스틱커피 4. 티상품 5. 뒤로가기 0. 종료")
            category = IllegalArgumentException(5).selectNumber()
        }
        when (category) {
            1 -> ProductSubCategory1(category).category()
            2 -> ProductSubCategory2(category).category()
            3 -> ProductSubCategory3(category).category()
            4 -> ProductSubCategory4(category).category()
            5 -> MainCategory(0).category()
            0 -> println("프로그램을 종료합니다.")
        }
    }
}

class ProductSubCategory1(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 머그컵 ]")
        println("1.뒤로가기 0. 종료")
        MugCup().item()
        var option = IllegalArgumentException(4).selectNumber()
        when (option) {
            0 -> ProductCategory(-1).category()
            1 -> ProductCategory(0).category()
        }
    }
}

class ProductSubCategory2(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 텀블러 ]")
        println("1. 뒤로가기 0. 종료")
        Tumbler().item()
        var option = IllegalArgumentException(4).selectNumber()
        when (option) {
            0 -> ProductCategory(-1).category()
            1 -> ProductCategory(0).category()
        }
    }
}

class ProductSubCategory3(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 스틱커피 ]")
        StickCoffee().item()
        println("1. 뒤로가기 0. 종료")
        var option = IllegalArgumentException(2).selectNumber()
        when (option) {
            0 -> ProductCategory(-1).category()
            1 -> ProductCategory(0).category()
        }
    }

}

class ProductSubCategory4(override var category: Int) : SelectCategory(category) {
    override fun category() {
        println("[ 티상품 ]")
        TeaProduct().item()

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

// 뒤로가기 & 프로그램 종료하기 함수


// 상세메뉴 추상 클래스 ==============================================================================

abstract class Item() {
    abstract fun item()
}


// 음료 상세 메뉴 ====================================================================================


class HotCoffee : Item() {
    override fun item() {
        println("핫 커피 리스트")
    }

}

class IcedCoffee : Item() {
    override fun item() {
        println("아이스 커피 리스트")
    }
}

class HotTea : Item() {
    override fun item() {
        println("핫 티 리스트")
    }
}

class IcedTea : Item() {
    override fun item() {
        println("아이스 티 리스트")
    }
}

class AdeJuice : Item() {
    override fun item() {
        println("에이드 & 커피 리스트")
    }
}

class SmoothieFrappe : Item() {
    override fun item() {
        println("스무디 & 프라페 리스트")
    }
}

// 베이커리 상세 메뉴 =================================================================================

class Bread : Item() {
    override fun item() {
        println("빵 리스트")
    }
}

class CookieMacaron : Item() {
    override fun item() {
        println("쿠키 & 마카롱 리스트")
    }

}

class Cake : Item() {
    override fun item() {
        println("케이크 리스트")
    }
}

// MD 상품 상세 메뉴 ================================================================================

class MugCup : Item() {
    override fun item() {
        println("머그컵 리스트")
    }
}

class Tumbler : Item() {
    override fun item() {
        println("텀블러 리스트")
    }
}

class StickCoffee : Item() {
    override fun item() {
        println("스틱 커피 리스트")
    }
}

class TeaProduct : Item() {
    override fun item() {
        println("티 상품 리스트")
    }
}