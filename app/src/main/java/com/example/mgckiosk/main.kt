package com.example.mgckiosk

import com.example.mgckiosk.menu.MGCMenu
//ㅤ/ /<-특수공백문자있음

// 메가 커피 키오스크 팀 과제 3조 파이팅!!
//큰 틀 카테고리 3개 [Beverage] [Food] [Product]

//Beverage -> [Coffee] [Tea] [Ade&Juice] [Smoothie&Frappe] / Food -> [Bread] [Cookie&Macaron] [Cake] / Product ->[Mug] [Tumbler] [StickCoffee] [TeaPleasure]

// Coffee -> 에스프레소[Hot] 아메리카노[Hot/Ice] 왕할메가커피[Ice] 카라멜마끼아또[Hot/Ice] 바닐라라떼[Hot/Ice]
// Tea   -> 복숭아아이스티[Ice] 녹차[Hot/Ice] 얼그레이[Hot/Ice] 캐모마일[Hot/Ice] 허니자몽블랙티[Hot/Ice]
// Ade&Juice -> Only Ice 메가에이드 라임모히또 블루레몬에이드 유니콘매직에이드 자몽에이드 체리콕 청포도에이드
// Smoothie&Frappe -> Only Ice 쿠키프라페 딸기요거트스무디 녹차프라페 망고요거트스무디 플레인요거트스무디 딸기퐁크러쉬 초코허니퐁크러쉬

// Bread -> 와앙피자보름달빵 와앙콘마요보름달빵 핫도그 감자빵 허니브레드 버터버터소금빵 크루아상
// Cookie&Macaron -> 뚱크림치즈약과쿠키 말차스모어쿠키 마카다미아쿠키 초콜릿칩쿠키 딸기요거트마카롱 메가초코마카롱 유니콘프라페마카롱 쿠키프라페마카롱
// Cake -> 몽쉘케이크 치즈케익 초코무스케익 티라미수케익 오트밀팬케이크 티라미수팬케이크

// Mug -> 엠지씨머그(옐로우) 머그(옐로우) 머그(블랙)
// Tumbler -> 엠지씨텀블러(웜그레이) 엠지씨텀블러(옐로우) 엠지씨텀블러(스카이) 텀블러(화이트) 텀블러(실버) 텀블러(브론즈)
// StickCoffee -> 메가엠지씨스틱오리지날아메리카노 메가엠지씨스틱디카페인아메리카노 메가엠지씨스틱스테비아믹스커피 메가엠지씨스틱스테비아디카페인믹스커피
// TeaPleasure -> 메가엠지씨티플레저블루밍캐모마일 메가엠지씨티플레저프루티루이보스 메가엠지씨티플레저스위트히비스커스

fun main() {
    val mgcMenu = MGCMenu()
    mgcMenu.displayInfo()
}

