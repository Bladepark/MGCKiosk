package com.example.mgckiosk

/*- Lv.4

- 현재 잔액과 가격을 비교해서 구매 가능한 상태를 정의해요 (클래스 추가가능)
커스토머 객체를 생성할 때, 인자로 보유 잔액을 입력합니다.

*/

class Customer(_money:Int) {
    var money = 0
    init {
        money=_money
    }
}