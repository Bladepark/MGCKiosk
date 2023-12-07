
//부모 클래스와 데이터 클래스 파일 분리 시도
//사용위치 : 키오스크2, 3

/*
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
*/

package com.example.mgckiosk

open class AllMegaMenu(open val name: String, open val price: Int, open val time: Int?, open val termo: String?)

data class Tea(override val name: String, override val price: Int, override val time: Int?, override val termo: String?
) : AllMegaMenu(name, price, time, termo)
data class Coffee(override val name: String, override val price: Int, override val time: Int?, override val termo: String?
) : AllMegaMenu(name, price, time, termo)
data class AdeJuice(override val name: String, override val price: Int, override val time: Int?, override val termo: String?
) : AllMegaMenu(name, price, time, termo)
data class Dessert(override val name: String, override val price: Int, override val time: Int?, override val termo: String?
) : AllMegaMenu(name, price, time, termo)

//장바구니 비어있는 리스트인데 추가/삭제 가능
//음~ 망시따 마트 다녀오셨서요?
/*
리스트 추가
fun main(){
    val addList = AllMegaMenu("앙녕",2342,4,null)
    jangBaGuNiList.add(addList)
}
리스트 한 개 제거
jangBaGuNiList.remove(인덱스 번호)

리스트 전체 제거
jangBaGuNiList.clear()
*/
val jangBaGuNiList:MutableList<AllMegaMenu> = mutableListOf()

//데이터를 줄줄이 집어넣어도 카테고리별 sort 하기 때문에 순서대로 너으면 귀차느니깐 아무럿개나 쓰쟈
val menuList: List<AllMegaMenu> = listOf(
    Coffee("에스프레소", 1500, 6, null),
    Coffee("아메리카노", 2000, 6, null),
    Coffee("왕할메가커피", 3500, 6, null),
    Coffee("카라멜마끼아또", 3700, 6, null),
    Coffee("바닐라라떼", 3400, 6, null),

    Tea("녹차", 3000, 5, null),
    Tea("얼그레이", 3000, 5, null),
    Tea("캐모마일", 3000, 5, null),
    Tea("사과유자차", 3000, 5, null),
    Tea("허니자몽블랙티", 3000, 5, null),

    AdeJuice("메가에이드", 3900, 6, null),
    AdeJuice("블루레몬에이드", 3500, 6, null),
    AdeJuice("유니콘매직에이드", 3800, 6, null),
    AdeJuice("자몽에이드", 3500, 6, null),
    AdeJuice("청포도에이드", 3500, 6, null),
    AdeJuice("라임모히또", 3800, 6, null),
    AdeJuice("체리콕", 3300, 6, null),

    Dessert("디저트 메뉴 1번", 7600, 10, null),
    Dessert("디저트 메뉴 2번", 8300, 10, null),
    Dessert("디저트 메뉴 3번", 5800, 10, null),
)

