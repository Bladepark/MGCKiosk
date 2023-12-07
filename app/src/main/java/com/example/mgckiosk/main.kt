//키오스크 5 : 할인기능 할 차례임

/* 코드 메모
*/

package com.example.mgckiosk

fun main(){
    wellcomeMenu()
    printMenu()
    selectMenu()
}





/* 기능구현 메모

!!! 4 번째에는 While 기능을 공부해서 구현해 보는 것을 우선으로 한다. !!!

인터페이스는 반드시 구현되어야 하는 기능을 선언하여 강제한다
가령 핫/아이스 선택, 쿠폰코드 입력

추상클래스로 일부 기능은 공유하되 자세한 기능은 하위 클레스에서 한다

일단 기존의 틀은 그대로 유지하되 반복되는 것을 하나의 클래스로 묶는 것을 목표로 한다

목표 : Class drinkMenu로 음료 통합


[ 나중에 사용해 볼 것, 클래스의 추상화? ]

abstract class Drink(val name: String, val time: Int, val price: Int) {
    abstract fun coffeeMenu()
    abstract fun selectTea()
    abstract fun selectAdeJuice()
    abstract fun selectDessert()

class Coffee: Drink(){
    fun coffeeMenu()
}

//여러 변수를 array로 생성
open var drinks: Array<Drink?> = arrayOfNulls(5)

*/
