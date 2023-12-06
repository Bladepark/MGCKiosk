
//부모 클래스와 데이터 클래스 파일 분리 시도, 키오스크 2

package com.example.mgckiosk

open class AllMegaMenu(open val name: String, open val price: Int, open val time: Int)

data class Tea(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)
data class Coffee(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)
data class AdeJuice(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)
data class Dessert(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)

//데이터를 줄줄이 집어넣어도 카테고리별 sort 하기 때문에 순서대로 넣으면 개어려운이까 아무럿개나 쓰쟈
val menuList: List<AllMegaMenu> = listOf(
    Tea("티 메뉴 1번", 3000, 5),
    Tea("티 메뉴 2번", 3500, 7),
    Coffee("커피 메뉴 1번", 4000, 6),
    Coffee("커피 메뉴 2번", 4500, 8),
    Dessert("디저트 메뉴 1번", 5000, 10),
    Tea("티 메뉴 3번", 3500, 7),
    Dessert("디저트 메뉴 2번", 5000, 10),
    Coffee("커피 메뉴 3번", 4000, 6),
    Coffee("커피 메뉴 4번", 4000, 6),
    AdeJuice("커피 메뉴 3번", 4000, 6),
    AdeJuice("커피 메뉴 3번", 4000, 6),
    AdeJuice("커피 메뉴 3번", 4000, 6),

    )